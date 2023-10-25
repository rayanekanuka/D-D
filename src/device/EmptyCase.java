package device;

import characters.Hero;

/**
 * Représente une case vide sur le plateau.
 */
public class EmptyCase  implements Case {

    /**
     * Affiche une description concernant la case vide.
     */

    public void interaction(Hero hero) {
        System.out.println("Case vide, comme le reflet de ton âme");
    }
}
