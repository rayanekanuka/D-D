package characters;

// Classe Magician héritée de la classe parent Hero
// Autre : si on ne donne pas de valeur aux attributs, ils prennent la valeur par défaut !
// pour int -> 0
// pour string -> null
// etc...
public class Magician extends Hero {

    public Magician() {
        super("Le Super Magicien", 5, 8, 8, "Magicien", 3, 6, 8, 15);
    }

    public Magician(String name) {
        super(name, 5, 3, 8, "Magicien");
    }

    public Magician(String name, int hp, int strength, int attack, String type) {
        super(name, hp, strength, attack, "Magicien");
    }

    // GETTER & SETTER //
    public int getMinHP() {
        return minHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public int getMaxStrength() {
        return maxStrength;
    }
}