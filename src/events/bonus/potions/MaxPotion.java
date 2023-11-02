package events.bonus.potions;

import characters.Hero;
import device.Case;

public class MaxPotion extends Potion {

    public MaxPotion() {
        super("Sacrée potion de soin", 5);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Génial une SUPER potion pour vous remettre d'aplomb ! \n" + this);
    }

}
