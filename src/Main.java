import characters.PersonnageHorsPlateauException;
import device.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu start = new Menu(scanner);
        start.gameMenu();
    }
}