package device;

import characters.Hero;
import characters.Magician;
import characters.Warrior;

import java.sql.*;


public class Database {
    private Connection mydb;

    Database() throws SQLException {
        try {
            String URL = "jdbc:mysql://localhost:3306/rayane-d-d";
            this.mydb = DriverManager.getConnection(URL, "root", "root");

        } catch (
                SQLException e) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
    }

    public Hero getHeroes(String name) throws SQLException {
        try {
            PreparedStatement st = mydb.prepareStatement("SELECT * FROM `hero`");
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String type = rs.getString("type");

                Hero hero = null;
                if (type.equals("Guerrier")) {
                    hero = new Warrior(name);
                } else if (type.equals("Magicien")) {
                    hero = new Magician(name);
                }
                return hero;
            } else {
                System.out.println("Aucun personnage trouvé avec le nom : " + name);
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erreur de la récupération du personnage depuis la base de données : " + e.getMessage());
            return null;
        }
    }


    public void createHero(Hero hero) throws SQLException {
        try {
            PreparedStatement st = mydb.prepareStatement("INSERT INTO hero (type, name, hp, strength, weapon_spell ) VALUES ( ?, ?, ?, ?, ?)");
            st.setString(1, hero.getType());
            st.setString(2, hero.getName());
            st.setInt(3, hero.getHp());
            st.setInt(4, hero.getStrength());
            st.setString(5, hero.getEquipementOffensif().getName());

            st.executeUpdate();

            st.close();

            System.out.println(hero.getName() + " inséré avec succès dans la base de données.");
        } catch (SQLException e) {
            System.out.println("Erreur de l'insertion du personnage dans la base de données : " + e.getMessage());
        }
    }

    public void editHero(Hero hero) throws SQLException {
        try {
            PreparedStatement st = mydb.prepareStatement("SELECT * FROM `hero`");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String type = rs.getString("Type");
                String name = rs.getString("Nom");
                int hp = rs.getInt("NiveauDeVie");
                int strength = rs.getInt("NiveauForce");
                String weapon = rs.getString("ArmeSort");

                System.out.println("Nom : " + name + " || Type : " + type + " || Niveau de vie : " + hp + " || Force d'attaque : " + strength + " || Equipement offensif : " + weapon);
                System.out.println("----------------------------");
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Erreur de la récupération des personnages depuis la base de données : " + e.getMessage());
        }
    }

    public void changeLifePoints(Hero hero) throws SQLException {
        PreparedStatement st = mydb.prepareStatement("UPDATE hero SET hp = ? WHERE id = ?");
        try {
            st.setInt(1, hero.getHp());
//            st.setInt(2, hero.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }


}


