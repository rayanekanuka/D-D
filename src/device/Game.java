package device;

import characters.Hero;
import characters.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Game {

    private int positionPlayer;
    private int boardSize;
    private int round;
    private Hero hero;

    public Game() {
        this.positionPlayer = 1; // Case de départ
        this.boardSize = 64; // plateau
        this.round = 0; // tour de jeu
        this.hero = hero;
    }

    public int throwDice() {
        int dice = (int) (Math.random() * 6) + 1;

        return dice;
    }

    public void move(Hero hero) throws PersonnageHorsPlateauException {
        Board newBoard = new Board();
        boolean game = false;

        while (!game) {
            int dice = throwDice();
            Scanner scan = new Scanner(System.in);
            System.out.println("LANCER vos dès : press D");
            String entry = scan.nextLine().toUpperCase();

            if (entry.equals("D")) {
                System.out.println("Wohooo ton dé : " + dice);
                positionPlayer = getPositionPlayer() + dice;
                hero.setPosition(positionPlayer);

                positionPlayer += dice;
                System.out.println("Vous êtes sur la case " + positionPlayer + "/64");

                newBoard.getCase.interaction(hero);
                System.out.println("POSITION de votre héros : " + hero.getPosition());

                round++;
                System.out.println("Au tour numéro : " + round);

                if (positionPlayer > boardSize) {
                    throw new PersonnageHorsPlateauException();
                }
            } else {
                endGame(hero);
                game = true;
            }
        }
    }


    public void endGame(Hero hero) throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Félicitations ! Vous êtes arrivé à la fin du jeu.");

        // Demande au joueur s'il veut recommencer ou quitter
        System.out.println("Voulez-vous recommencer une partie ? (Oui/Non)");
        setPositionPlayer(1);
        String choix = scanner.next();
        if (choix.equalsIgnoreCase("Oui")) {
            move(hero); // Recommencer une partie
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

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }


}
