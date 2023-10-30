package events.bonus.spells;

import characters.Hero;

public class Flash extends Spell {
    public Flash(String name, int attack) {
        super(name, attack);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous vous êtes pris un Eclair ! Aux abris !");
    }
}
