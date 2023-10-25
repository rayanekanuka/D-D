package device;

import characters.Hero;
import characters.Warrior;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int positionPlayer;
    private int boardSize;

    public Game() {
        this.positionPlayer = 1; // Case de départ
        this.boardSize = 64;
    }

    public void gameStart() {
        System.out.println("Bienvenue dans cette nouvelle partie ! Vous commencez à la case n°0");
        Board boardObjet = new Board();
        ArrayList<Case> board = boardObjet.getBoard();
        for (int i = 0; i < boardSize; i++) {
            board.get(i).interaction(new Warrior());
        }
        System.out.println("TEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEST");


        throwDice();
    }

    // Méthode pour lancer le dé et faire avancer le joueur
    public void throwDice() {

        while (positionPlayer < boardSize) {
            int dice; // Random dé
            dice = (int) (Math.random() * 6) + 1;
            System.out.println("Wohooo ton dé : " + dice);
            System.out.println("Vous êtes maintenant sur la case " + positionPlayer + "/64");


            // Avance le joueur sur le plateau =>
            // positionPlayer = positionPlayer + dice
            positionPlayer += dice;

            // Vérification si la position dépasse 64
            if (positionPlayer > boardSize) {
                positionPlayer = boardSize;
            }
        }
        System.out.println("Vous êtes sur la case " + positionPlayer + " sur " + boardSize);
        endGame();
    }

    public void endGame() {
        Scanner pscanner = new Scanner(System.in);
        System.out.println("Félicitations ! Vous êtes arrivé à la fin du jeu.");

        // Demande au joueur s'il veut recommencer ou quitter
        System.out.println("Voulez-vous recommencer une partie ? (Oui/Non)");
        setPositionPlayer(0);
        String choix = pscanner.next();
        if (choix.equalsIgnoreCase("Oui")) {
            gameStart(); // Recommencer une partie
        } else {
            System.out.println("Merci d'avoir joué. Au revoir !");
        }
    }

    // GETTERS & SETTERS

    public int getPositionPlayer() {
        return positionPlayer;
    }

    public void setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }


}
