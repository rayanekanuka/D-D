package events.bonus.potions;

import characters.Hero;
import device.Case;
import events.bonus.EquipementDefensif;

public class MaxPotion extends Potion implements Case {
    public MaxPotion(String name) {
        super(name);
    }

    @Override
    public void interaction(Hero hero) {

    }
}
