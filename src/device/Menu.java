package device;

import characters.Hero;
import characters.Magician;
import characters.Warrior;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    //    Scanner grande classe qu'on initialise avec la méthode scanner
    private final Scanner scanner;
    public Hero hero;
    public Database DBConnexion;

    {
        DBConnexion = new Database();
    }


    // Constructeur de la classe Menu;
    // Le scanner est utilisé pour obtenir les entrées de l'utilisateur
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    private int affichageMenu() {
        // Affiche-moi ---->
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("[1] Créer un personnage");
        System.out.println("[2] Afficher les personnages BDD");
        System.out.println("[3] Modifier le personnage");
        System.out.println("[4] JOUER !");
        System.out.println("[5] Quitter le jeu");
        int playerChoice = scanner.nextInt();
        return playerChoice;
    }

    public void gameMenu() {
        decoMenu();
        // Je crée un booléan de vérification que je détermine comme faux
        boolean isReady = false;
        Game game = new Game();

        // Tant que isReady est faux
        while (!isReady) {
            switch (affichageMenu()) {
                case 1 -> {
                    hero = newHero();
                    System.out.println(hero);
                    createInDatabase();
                }
                case 2 -> displayInDatabase();
                case 3 -> {
                    if (hero != null) hero = modifyHero();
                }
                case 4 -> {
                    if (hero != null) game.move(hero);
                }
                case 5 -> {
                    System.out.println("Oh nooon vous avez quitté le jeu ! A bientôt :) ");
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                }
                default -> System.out.println("Veuillez entrer un choix valide !");
            }
        }
    }

    public Hero newHero() {
        Scanner newHero = new Scanner(System.in);
        System.out.print("Taper le nom : ");
        String nameHero = newHero.nextLine().toUpperCase();

        System.out.print("Taper le Type : Magicien ou Guerrier ? ");
        String typeHero = newHero.nextLine().toUpperCase();

        if (typeHero.equalsIgnoreCase("Guerrier")) {
            return hero = new Warrior(nameHero);
        } else {
            typeHero.equalsIgnoreCase("Magicien");
            return hero = new Magician(nameHero);
        }
    }

    public void createInDatabase() {
        DBConnexion.createHero(hero);
    }

    public void displayInDatabase() {
        try {
        DBConnexion.getHeroes();
        System.out.println("Quel personnage souhaites-tu jouer?");
        String nameHero = scanner.next().toUpperCase();
        hero = DBConnexion.chooseHero(nameHero);
        System.out.println(hero.toString());
        } catch (SQLException e) {
            System.out.println("Aucun personnage trouvé dans la base de données");
        }
    }



    private Hero modifyHero() {
        Scanner newHero = new Scanner(System.in);
        String nameHero = null;
        String typeHero = null;

        System.out.print("Voulez vous changer des infos?  [y/n]");
        if (newHero.nextLine().equals("y")) {
            System.out.print("Voulez vous changer le nom?  [y/n]");
            if (newHero.nextLine().equals("y")) {
                System.out.print("Taper le nouveau nom : ");
                nameHero = newHero.nextLine();
            }
            System.out.print("Voulez vous changer la classe?  [y/n]");
            if (newHero.nextLine().equals("y")) {
                System.out.print("Taper la nouvelle classe : ");
                typeHero = newHero.nextLine();
            }
        }
        if (typeHero.equalsIgnoreCase("Guerrier")) {
            return hero = new Warrior(nameHero);
        } else {
            typeHero.equalsIgnoreCase("Magicien");
            return hero = new Magician(nameHero);
        }
    }


    private void decoMenu() {
        System.out.println("\n" +
                "██████╗  ██████╗ ███╗   ██╗     ██╗ ██████╗ ███╗   ██╗███████╗       ██╗       ██████╗ ██████╗  █████╗  ██████╗  ██████╗ ███╗   ██╗███████╗\n" +
                "██╔══██╗██╔═══██╗████╗  ██║     ██║██╔═══██╗████╗  ██║██╔════╝       ██║       ██╔══██╗██╔══██╗██╔══██╗██╔════╝ ██╔═══██╗████╗  ██║██╔════╝\n" +
                "██║  ██║██║   ██║██╔██╗ ██║     ██║██║   ██║██╔██╗ ██║███████╗    ████████╗    ██║  ██║██████╔╝███████║██║  ███╗██║   ██║██╔██╗ ██║███████╗\n" +
                "██║  ██║██║   ██║██║╚██╗██║██   ██║██║   ██║██║╚██╗██║╚════██║    ██╔═██╔═╝    ██║  ██║██╔══██╗██╔══██║██║   ██║██║   ██║██║╚██╗██║╚════██║\n" +
                "██████╔╝╚██████╔╝██║ ╚████║╚█████╔╝╚██████╔╝██║ ╚████║███████║    ██████║      ██████╔╝██║  ██║██║  ██║╚██████╔╝╚██████╔╝██║ ╚████║███████║\n" +
                "╚═════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝\n" +
                "                                                                                                                                           \n");
    }
}

