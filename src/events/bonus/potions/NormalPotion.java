package events.bonus.potions;

import characters.Hero;

public class NormalPotion extends Potion {

    public NormalPotion() {
        super("Potion de soin normale", 2);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Joliii tu as trouvé, une petite potion \n" +this);
        heal(hero);
        System.out.println("Vous passez à " + hero.getHp() + " de vie, n'est-ce pas formidable???");
    }

}
