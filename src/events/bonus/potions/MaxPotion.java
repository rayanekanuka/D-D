package events.bonus.potions;

import characters.Hero;
import device.Case;

public class MaxPotion extends Potion implements Case {
    public MaxPotion(String name) {
        super(name);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Ohlala une SUPER potion pour vous remettre d'aplomb !");
    }
}
