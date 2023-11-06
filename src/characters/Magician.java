package characters;

import events.bonus.spells.Flash;

/**
 * Classe Magician héritée de la classe parent Hero
 * Autre : si on ne donne pas de valeur aux attributs, ils prennent la valeur par défaut !
 * pour int -> 0
 * pour string -> null
 * etc...
 */
public class Magician extends Hero {

    public Magician(String name) {
        super(name, 5, 8, 8, "Magicien", 0, 6, 0, 15, new Flash());
    }

    public Magician() {
        super("Le Super Magicien", 5, 3, 8, "Magicien");
    }
}