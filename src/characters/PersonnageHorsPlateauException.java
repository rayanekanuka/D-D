package characters;

public class PersonnageHorsPlateauException extends Exception {
    public PersonnageHorsPlateauException() {

    }
    // méthode getMessage() que l'on retrouve dans la classe Exception de Java, dans Throwable,
    // Renvoie la chaîne de message détaillée ; à la base j'ai utilisé super() pour le message

    /**
     *
     * @return Retourne un message à afficher dans la console
     */
    public String getMessage(){return "Vous avez dépassé la case finale, dommage...";}
}
