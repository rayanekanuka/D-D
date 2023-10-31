package events.bonus.potions;

import characters.Hero;

public class NormalPotion extends Potion {

    public NormalPotion() {
        super("Potion de soin normale", 2);
    }

    @Override
    public String toString(){
        return "La " + this.name + ", va te rendre " + this.hp + " points de vie !";
    }
    @Override
    public void interaction(Hero hero) {
        System.out.println("Joliii tu as trouvé, une petite potion \n" +this);
    }


}
