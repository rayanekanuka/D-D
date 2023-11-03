package device;

import characters.Hero;
import characters.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Game {
    private int boardSize;
    private int round;

    public Game() {
        this.boardSize = 64; // plateau
        this.round = 0; // tour de jeu
    }

    public int throwDice() {
        int dice = (int) (Math.random() * 6) + 1;

        return dice;
    }

    public void move(Hero hero) throws PersonnageHorsPlateauException {
        hero.setPosition(1); // Case de départ
        Board newBoard = new Board();
        boolean game = false;

        while (!game && hero.isAlive()) {
            Scanner scan = new Scanner(System.in);
            System.out.println("LANCER vos dés : press D");
            int dice = throwDice();

            String entry = scan.nextLine().toUpperCase();

            if (entry.equalsIgnoreCase("D")) {
                System.out.println("Wohooo ton dé : " + dice);

                hero.setPosition(hero.getPosition() + dice);
                System.out.println("Vous êtes sur la case " + hero.getPosition() + "/64");
                if (hero.getPosition() + dice > boardSize) {
                    throw new PersonnageHorsPlateauException();
                }
                newBoard.getCase(hero.getPosition()).interaction(hero);
                System.out.println("POSITION de votre héros : " + hero.getPosition());

                round++;
                System.out.println("Au tour numéro : " + round);

            } else if (hero.getPosition() >= boardSize) {
                 {
                     endGame(hero);
                     game = true;
                }

            }
        }
    }


    public void endGame(Hero hero) throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Félicitations ! Vous êtes arrivé à la fin du jeu.");

        // Demande au joueur s'il veut recommencer ou quitter
        System.out.println("Voulez-vous recommencer une partie ? (Oui/Non)");
        hero.setPosition(1);
        String choix = scanner.next();
        if (choix.equalsIgnoreCase("Oui")) {
            move(hero); // Recommencer une partie
        } else if (choix.equalsIgnoreCase("Non")) {
            move(hero);
            System.out.println("Merci d'avoir joué. Au revoir !");
        }
    }

}
