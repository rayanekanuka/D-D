package characters;

public class PersonnageHorsPlateauException extends Exception {
    public PersonnageHorsPlateauException() {
        super("Vous avez dépassé la case finale, dommage...");
    }
}
