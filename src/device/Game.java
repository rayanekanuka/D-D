package device;

import characters.Hero;
import characters.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Game {
    public Board board;
    private int boardSize;
    private int round;

    public Game() {
        this.boardSize = 64; // plateau
        this.round = 0; // tour de jeu
        board = new Board();
    }



    public void move(Hero hero) {
        System.out.println("Aller commençons ! Faites-nous rêver :) ");
        boolean game = false;
        while (!game && hero.isAlive()) {
            try {
                board.movePlayer();
                Case caseActuelle = board.getCase();
                System.out.println("Vous êtes sur la case " + caseActuelle + "/64");
                caseActuelle.interaction(hero);
                round++;
                System.out.println("Au tour numéro : " + round);

            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Bravo tu as gagné !");
                endGame(hero);
            }
        }
    }


    public void endGame(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Félicitations ! Vous êtes arrivé à la fin du jeu.");

        // Demande au joueur s'il veut recommencer ou quitter
        System.out.println("Voulez-vous recommencer une partie ? (Oui/Non)");
        hero.setPosition(1);
        String choix = scanner.next();
        if (choix.equalsIgnoreCase("Oui")) {
            move(hero); // Recommencer une partie
        } else if (choix.equalsIgnoreCase("Non")) {
            System.out.println("Merci d'avoir joué. Au revoir !");
        }
    }

}
