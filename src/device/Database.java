package device;

import characters.Hero;
import characters.Magician;
import characters.Warrior;


/**
 * Importation des packages pour les programmes standards de JDBC
 * permet de @select, @insert, @update les datas dans les tables SQL
 */
import java.sql.*;


public class Database {
    /**
     * Attribut qui initialise un objet de type Connection qui sera instancié après
     */
    private Connection mydb;

    /**
     * Constructeur Database qui initialise la connexion à la BDD
     */
    Database() {
        try {
            // appel et connecte à la DB grâce à la méthode DriverManager.getConnection
            String URL = "jdbc:mysql://localhost:3306/rayane-d-d";
            this.mydb = DriverManager.getConnection(URL, "root", "root");
        } catch (
                SQLException e) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
    }

    /**
     * Méthode getHeroes qui affiche la liste de tous les personnages
     *
     * @throws SQLException permet de gérer les erreurs de compilation en déléguant la responsabilité à la méthode appelée
     *
     * "Statement" représente une instruction SQL
     * "PreparedStatement" permet d'initialiser une requête SQL, cette instance contient une instruction SQL déjà compilée et prend un ou plusieurs
     *  paramètres en entrée, ceux-ci sont représentés par des points d'interrogation (?) et spécifiés avant l'exécution
     *
     *  le "ResultSet" = tableau dont les colonnes sont celles qui ont été extraites par notre requête SQL,
     *  et dont les lignes sont les résultats de cette requête
     *
     *  La méthode "executeQuery" retourne une liste d'objets de type ResultSet (instruction Statement/PreparedStatement/CallableStatment), ne retourne jamais null
     *  La méthode .next() permet d'afficher les infos récupérées avec une commande SQL
     */
    public void getHeroes() {
        try {
            PreparedStatement st = mydb.prepareStatement("SELECT * FROM `hero`"); // prepareStatement spécifie des attributs
            ResultSet rs = st.executeQuery();
            // exploitation du résultat
            while (rs.next()) {
                int id = rs.getInt("id");
                String type = rs.getString("type");
                String name = rs.getString("name");
                int hp = rs.getInt("hp");
                int strength = rs.getInt("strength");
                String weapon = rs.getString("weapon_spell");

                System.out.println("ID : " + id + " || Nom : " + name + " || Type : " + type + " || Niveau de vie : " + hp + " || Force d'attaque : " + strength + " || Equipement offensif : " + weapon);
                System.out.println("----------------------------");
            }
            st.close(); // fermeture d'un objet Statement
        } catch (SQLException e) {
            System.out.println("Erreur de la récupération des personnages depuis la base de données : " + e.getMessage());
        }
    }

    /**
     * Méthode createHero qui permet d'enregistrer un personnage en BDD une fois que l'utilisateur l'a créé
     *
     * @param hero prend en paramètres le personnage
     * @throws SQLException
     */
    public void createHero(Hero hero) {
        try {
            PreparedStatement st = mydb.prepareStatement("INSERT INTO hero (type, name, hp, strength, weapon_spell ) VALUES ( ?, ?, ?, ?, ?)");
            st.setString(1, hero.getType());
            st.setString(2, hero.getName());
            st.setInt(3, hero.getHp());
            st.setInt(4, hero.getStrength());
            st.setString(5, hero.getEquipementOffensif().getName());

            st.executeUpdate(); // exécute une instruction SQL fournie, retourne un nombre correct de lignes

            st.close(); // fermeture d'un objet Statement

            System.out.println(hero.getName() + " inséré avec succès dans la base de données.");
        } catch (SQLException e) {
            System.out.println("Erreur de l'insertion du personnage dans la base de données : " + e.getMessage());
        }
    }

    /**
     * Méthode qui permet de choisir un personnage parmi ceux déjà existants dans la BDD
     *
     * @param name prend en paramètre le nom du personnage
     * @return Obtient ce nom
     * @throws SQLException La méthode .next() permet d'afficher les infos récupérées avec une commande SQL
     */
    public Hero chooseHero(String name) throws SQLException {

        PreparedStatement st = mydb.prepareStatement("SELECT * FROM `hero` WHERE `name` = ?");
        st.setString(1, name);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            String type = rs.getString("type");

            Hero hero = null;
            if (type.equals("Warrior")) {
                hero = new Warrior(name);
            } else if (type.equals("Magician")) {
                hero = new Magician(name);
            }
            return hero;
        } else {
            System.out.println("Aucun personnage trouvé avec le nom : " + name);
            return null;
        }
    }


//    public void changeLifePoints(Hero hero) throws SQLException {
//        PreparedStatement st = mydb.prepareStatement("UPDATE hero SET hp = ? WHERE id = ?");
//        try {
//            st.setInt(1, hero.getHp());
////            st.setInt(2, hero.getId());
//            st.executeUpdate();
//        } catch (SQLException e) {
//            e.getMessage();
//        }
//    }

}



