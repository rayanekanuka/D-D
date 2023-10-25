package device;

import characters.Hero;

import java.util.ArrayList;

public class Board implements Case {
    private final ArrayList<Case> board;
    private int positionPlayer; // position actuelle du joueur

    /**
     * Constructeur.
     * Initialise un plateau de jeu et place le joueur.
     */
    public Board() {
        board = new ArrayList<>(); // Initialisation de la liste du plateau
        positionPlayer = 1; // Le joueur commence à la case 1

        // Instancier les Case sur le plateau
        for (int i = 0; i < 64; i++) {
            // ici toutes les conditions de cases à implémenter avec la méthode .add()

        }
    }

    @Override
    public void interaction(Hero hero) {

    }
}
