package events.bonus.potions;

import characters.Hero;

public class NormalPotion extends Potion {
    public NormalPotion(String name) {
        super(name);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Joliii une potion pour reprendre un peu de vie");
    }
}
