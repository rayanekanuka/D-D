package device;

import characters.Hero;
import events.bonus.potions.MaxPotion;
import events.bonus.potions.NormalPotion;
import events.bonus.spells.FireBall;
import events.bonus.spells.Flash;
import events.bonus.weapons.Hammer;
import events.bonus.weapons.Sword;
import events.enemies.Dragon;
import events.enemies.Gobelin;
import events.enemies.Sorcerer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * La classe BOARD représente le plateau de jeu et gère la génération des cases
 */
public class Board implements Case {
    private final ArrayList<Case> board; // add - get - set - remove - clear - size
    private int positionPlayer; // position actuelle du joueur


    /**
     * Constructeur.
     * Initialise un plateau de jeu et place le joueur.
     */
    public Board() {
        board = new ArrayList<Case>(); // Initialisation de la liste du plateau
        positionPlayer = 1; // Le joueur commence à la case 1

        // Instancier les Case sur le plateau
        for (int i = 0; i < 64; i++) {
            switch (i) {
                case 45, 52, 56, 62 -> board.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> board.add(new Sorcerer());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> board.add(new Gobelin());
                case 2, 11, 5, 22, 38 -> board.add(new Hammer());
                case 19, 26, 42, 53 -> board.add(new Sword());
                case 1, 4, 8, 17, 23 -> board.add(new Flash());
                case 48, 49 -> board.add(new FireBall());
                case 7, 13, 31, 33, 39, 43 -> board.add(new NormalPotion());
                case 28, 41 -> board.add(new MaxPotion());
                default -> board.add(new EmptyCase());
            }
            Collections.shuffle(board);
        }
    }


    // GETTER & SETTER

    public ArrayList<Case> getBoard() {
        return board;
    }

    public int getPositionPlayer() {
        return positionPlayer;
    }



    /**
     *
     * @param positionPlayer
     * @return la case actuelle du Joueur en fonction de sa position
     */
    public Case getCase(int positionPlayer) {
        return board.get(positionPlayer);
    }

    /**
     * Gère l'interaction du joueur avec la case actuelle
     * @param hero
     */
    @Override
    public void interaction(Hero hero) {

    }
}
