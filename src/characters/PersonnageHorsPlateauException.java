package characters;

/**
 * Une EXCEPTION PERSONALISEE pour gérer le cas où le personnage est hors du plateau.
 */
public class PersonnageHorsPlateauException extends Exception {
    /**
     * Constructeur de l'exception.
     * Crée une nouvelle INSTANCE de PersonnageHorsPlateauException avec un message par défaut.
     */
    public PersonnageHorsPlateauException() {
        super("Vous êtes allé trop loin ! C'est gagné =) ");
    }


    // méthode getMessage() que l'on retrouve dans la classe Exception de Java, dans Throwable,
    // Renvoie la chaîne de message détaillée ; à la base j'ai utilisé super() pour le message
//    /**
//     *
//     * @return Retourne un message à afficher dans la console
//     */
//    public String getMessage(){return "Vous avez dépassé la case finale, dommage...";}
}
