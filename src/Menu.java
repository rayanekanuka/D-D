import java.util.Scanner;

public class Menu {
    //    Scanner grande classe qu'on initialise avec la var scanner
    private final Scanner scanner;

    public Menu(Scanner scanner) {

        this.scanner = scanner;
    }

    // Méthode chooseHero qui permet d'instancier le Hero ici
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
            //Instancier un nouveau scanner qui récupère le input/l'entrée
//            Scanner scanner = new Scanner(System.in);
            // Affiche-moi ---->
            System.out.println("Veuillez choisir votre personnage :\n Guerrier ?\n Magicien ?\n START ? \n ou Echap pour quitter le jeu : ");
            String playerChoice = scanner.nextLine().toUpperCase();


            switch (playerChoice) {
                // dans le cas où l'utilisateur choisit le Guerrier
                case "START" -> {
                    System.out.println("Aller faites-nous rêver");
                    Board newBoard = new Board();
                    newBoard.throwDice();
                }
                case "GUERRIER" -> {
                    System.out.println("Veuillez choisir le nom de votre Héros : ");
                    String playerName = scanner.nextLine().toUpperCase();
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero1 = new Hero(playerName, playerChoice);
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                    System.out.println(hero1);
                    return hero1;
                }
                case "MAGICIEN" -> {
                    System.out.println("Veuillez choisir le nom de votre Héros : ");
                    String playerName = scanner.nextLine().toUpperCase();
                    // dans le cas où l'utilisateur choisit le Magicien
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero2 = new Hero(playerName, playerChoice);
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                    System.out.println(hero2);
                    return hero2;
                }


                case "ECHAP" -> {
                    // dans le cas où l'utilisateur choisi la touche ECHAP
                    System.out.println("Oh nooon vous avez quitté le jeu ! A bientôt :) ");
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = false;
                    return null;
                }
                // Si toutefois aucun de ces cas n'est choisi alors le "default" se lance
                default -> System.out.println("Veuillez entrer un choix valide !");
            }
        }
        return null;
    }

    // Création d'un héros
//    public Menu newGame() {
//        Scanner newHero = new Scanner(System.in);
//        System.out.print("Taper le nom : ");
//        String nameHero = newHero.nextLine();
//
//        System.out.print("Taper le Type : ");
//        String typeHero = newHero.nextLine();
//
//        while (!typeHero.equals("Warrior") && !typeHero.equals("Wizard")) {
//            System.out.println("Veuillez choisir entre 'Warrior' et 'Wizard'");
//            System.out.print("Taper le Type : ");
//            typeHero = newHero.nextLine();
//        }
//
//        System.out.print("Voulez vous changer des infos?  [y/n]");
//        if (newHero.nextLine().equals("y")) {
//            System.out.print("Voulez vous changer le nom?  [y/n]");
//            if (newHero.nextLine().equals("y")) {
//                System.out.print("Taper le nouveau nom : ");
//                nameHero = newHero.nextLine();
//            }
//            System.out.print("Voulez vous changer la classe?  [y/n]");
//            if (newHero.nextLine().equals("y")) {
//                System.out.print("Taper la nouvelle classe : ");
//                typeHero = newHero.nextLine();
//            }
//        }
//    }

}

