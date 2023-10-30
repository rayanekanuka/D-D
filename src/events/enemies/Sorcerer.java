package events.enemies;

import characters.Hero;

public class Sorcerer extends Enemy {
    public Sorcerer(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Sorcerer() {
        this("Voldemort", 9, 2);
    }

    @Override
    public String toString() {
        return " [ Ennemi = '" + name + '\'' +
                ", Points de vie = " + hp +
                ", Force d'Attaque = " + strength +
                " ]";
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("OULAH, c'est celui-dont-on-ne-doit-pas-prononcer-le-nom !\n Fuyez avant qu'il ne soit trop tard =O \n" + this);
    }
}
