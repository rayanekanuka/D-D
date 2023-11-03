package characters;

import events.bonus.weapons.Hammer;

// Classe Warrior héritée de la classe parent Hero
public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 5, 5, 5, "Warrior", 5, 10, 5, 10, new Hammer());
    }

    public Warrior() {
        super("Le Super Guerrier", 5, 5, 10, "Guerrier");
    }
}

