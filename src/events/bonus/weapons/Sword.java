package events.bonus.weapons;


import characters.Hero;

public class Sword extends Weapon {
    public Sword(String name) {
        super(name);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez une épée");
    }
}
