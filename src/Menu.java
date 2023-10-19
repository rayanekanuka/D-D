import java.util.Scanner;

public class Menu {
    //    Scanner grande classe qu'on initialise avec la var scanner
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }


    public static void showMenu() {
        System.out.println("-------- BIENVENUE DANS DONJONS & DRAGONS --------");
    }

    // Méthode chooseHere qui permet d'instancier le Hero ici
    // Si je veux l'utiliser ailleurs penser à la retourner (mot clé return)
    public Hero chooseHere() {
        // Je crée un booléan de vérification que je détermine comme faux
        boolean isReady = false;

        // Tant que isReady est faux
        while (!isReady) {
            //Instancier un nouveau scanner qui récupère le input/l'entrée
//            Scanner scanner = new Scanner(System.in);
            // Affiche-moi ---->
            System.out.println("Veuillez choisir votre personnage :\n Guerrier ? Magicien ? ou Echap pour quitter le jeu (un peu de nerfs quand même) : ");
            String playerChoice = scanner.nextLine().toUpperCase();
            switch (playerChoice) {
                // dans le cas où l'utilisateur choisit le Guerrier
                case "GUERRIER" -> {
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero1 = new Hero();
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                    return hero1;
                }
                case "MAGICIEN" -> {
                    // dans le cas où l'utilisateur choisit le Magicien
                    System.out.println("Vous avez choisi le " + playerChoice + ", préparez-vous à la bagarre !");
                    Hero hero2 = new Hero();
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
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

// méthode createHero


//
//    public startGame() {
//
//    }


    //    boolean exitStartMenu = false;
//    boolean exitSousMenu = false;


// Méthode pour afficher le menu principal et gérer les commandes
//    public void displayMenu() {
//        boolean continueGame = true;
//        Hero myHero = null;
//        PlateGame plate = new PlateGame(); // Génération du plateau
//        Game game = new Game(); // Création d'un Game
//    }

//    if (continueGame) {
//        System.out.println("Quel est votre prénom ?");
//    }

}
