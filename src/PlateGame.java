public class PlateGame {
    private int positionPlayer;

    public PlateGame() {
        this.positionPlayer = 0; // Case de départ
    }

    // Méthode pour lancer le dé et faire avancer le joueur
    public void throwDice() {
        int dice; // Random dé
        dice = (int) (Math.random() * 6) + 1;
        System.out.println("Tu te rapproches.. : " + dice);

        // Avance le joueur sur le plateau
        positionPlayer += dice;

        // Vérification si la position dépasse 64
        if (positionPlayer > 64) {
            int surplus = positionPlayer - 64;
            positionPlayer = 64 - surplus;
        }

        // Maintenant les conditions?
        // Ou plutôt dans game?
    }

    public int getPositionPlayer() {
        return positionPlayer;
    }
}