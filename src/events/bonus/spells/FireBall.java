package events.bonus.spells;

import characters.Hero;

public class FireBall extends Spell {
    public FireBall(String name, int attack) {
        super(name, attack);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vite cachez-vous une Boule de Feu vous a frôlé !");
    }
}
