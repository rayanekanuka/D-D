import java.util.Scanner;

public class Menu {
    //    Scanner grande classe qu'on initialise avec la var scanner
    private final Scanner scanner;

    // Constructeur de la classe Menu;
    // Le scanner est utilisé pour obtenir les entrées de l'utilisateur

    public Menu(Scanner scanner) {

        this.scanner = scanner;
    }

    // Méthode chooseHero qui permet d'afficher le Menu et d'instancier le Hero ici
    // Si je veux l'utiliser ailleurs penser à la retourner (mot clé return)
    public Hero chooseHero() {
        System.out.println("\n" +
                "██████╗  ██████╗ ███╗   ██╗     ██╗ ██████╗ ███╗   ██╗███████╗       ██╗       ██████╗ ██████╗  █████╗  ██████╗  ██████╗ ███╗   ██╗███████╗\n" +
                "██╔══██╗██╔═══██╗████╗  ██║     ██║██╔═══██╗████╗  ██║██╔════╝       ██║       ██╔══██╗██╔══██╗██╔══██╗██╔════╝ ██╔═══██╗████╗  ██║██╔════╝\n" +
                "██║  ██║██║   ██║██╔██╗ ██║     ██║██║   ██║██╔██╗ ██║███████╗    ████████╗    ██║  ██║██████╔╝███████║██║  ███╗██║   ██║██╔██╗ ██║███████╗\n" +
                "██║  ██║██║   ██║██║╚██╗██║██   ██║██║   ██║██║╚██╗██║╚════██║    ██╔═██╔═╝    ██║  ██║██╔══██╗██╔══██║██║   ██║██║   ██║██║╚██╗██║╚════██║\n" +
                "██████╔╝╚██████╔╝██║ ╚████║╚█████╔╝╚██████╔╝██║ ╚████║███████║    ██████║      ██████╔╝██║  ██║██║  ██║╚██████╔╝╚██████╔╝██║ ╚████║███████║\n" +
                "╚═════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝\n" +
                "                                                                                                                                           \n");
        // Je crée un booléan de vérification que je détermine comme faux
        boolean isReady = false;

        // Tant que isReady est faux
        while (!isReady) {
            // Affiche-moi ---->
            System.out.println("Bienvenue dans le célèbre jeu Donjons & Dragons :) \n ");
            System.out.println("Que souhaitez-vous faire ?\n Choisir un personnage : Guerrier ou Magicien ?\n ");
            System.out.println("CREER votre personnage ? \n JOUER ? \n ou Echap pour quitter le jeu :");
            String playerChoice = scanner.nextLine().toUpperCase();

            switch (playerChoice) {
                case "CREER" -> {
                    newHero();
                }
                case "JOUER" -> {
                    System.out.println("Aller commençons ! Faites-nous rêver :) ");
                    Board newBoard = new Board();
                    newBoard.throwDice();
                    isReady = true;
                }
                // dans le cas où l'utilisateur choisit le Guerrier
                case "GUERRIER" -> {
                    System.out.println("Veuillez choisir le nom de votre Héros : ");
                    String playerName = scanner.nextLine().toUpperCase();
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero1 = new Hero(playerName, playerChoice);
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = false;
                    System.out.println(hero1);
                    return hero1;
                }
                // dans le cas où l'utilisateur choisit le Magicien
                case "MAGICIEN" -> {
                    System.out.println("Veuillez choisir le nom de votre Héros : ");
                    String playerName = scanner.nextLine().toUpperCase();
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero2 = new Hero(playerName, playerChoice);
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = false;
                    System.out.println(hero2);
                    return hero2;
                }
                case "ECHAP" -> {
                    // dans le cas où l'utilisateur choisi la touche ECHAP
                    System.out.println("Oh nooon vous avez quitté le jeu ! A bientôt :) ");
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                    return null;
                }
                // Si toutefois aucun de ces cas n'est choisi alors le "default" se lance
                default -> System.out.println("Veuillez entrer un choix valide !");
            }
        }
        return null;
    }


    public void newHero() {
        Scanner newHero = new Scanner(System.in);
        System.out.print("Taper le nom : ");
        String nameHero = newHero.nextLine();

        System.out.print("Taper le Type : ");
        String typeHero = newHero.nextLine();

        while (!typeHero.equals("Guerrier") && !typeHero.equals("Magicien")) {
            System.out.println("Veuillez choisir entre 'Guerrier' et 'Magicien'");
            System.out.print("Taper le Type : ");
            typeHero = newHero.nextLine();
        }

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
    }
}

