package characters;

public class Magician extends Hero {
    // 2. Attention aux doubles déclarations d'attributs
// minStrength ici -> il s'appelle this.minStrength
// si déclaré chez les parents -> il s'applelle super.minStrength
    // Si tu donnes pas de valeur aux attributs, ils prennent la valeur par défaut !
// pour int -> 0
// pour string -> null
// etc...
    public Magician() {
        super("Le Super Magicien", 5, 8, 8, "Magicien", 3, 6, 8, 15);
    }

    public Magician(String name) {
        super(name, 5, 3, 8, "Magicien");
    }

    public Magician(String name, int hp, int strength, int attack, String type) {
        super(name, hp, strength, attack, "Magicien");
    }
}