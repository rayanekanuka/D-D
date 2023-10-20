//public class Game {
//    public void newGame(Board plate, Hero myHero) {
//        System.out.println("Let's Start !");
//        boolean GameOver = false;
//
//        while (!GameOver) {
//            plate.throwDice(); // Lance le dé à chaque tour
//
//            // Vérifie si le joueur a atteint la dernière case (case 64)
//            if (Board.getPositionPlayer() == 64) {
//                System.out.println("Félicitations ! Vous avez enfin terminé..");
//                GameOver = true;
//            } else {
//                System.out.println(myHero.getName() + "se trouve sur la case : " + Board.getPositionPlayer() + " / 64");
//            }
//
//            // Evenements & conditions ?
//        }
//    }
//}