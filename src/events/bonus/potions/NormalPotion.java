package events.bonus.potions;

import characters.Hero;

public class NormalPotion extends Potion {

    public NormalPotion(String name, int hp) {
        super(name, hp);
    }

    public NormalPotion() {
        this("Potion de soin normale", 2);
    }

    @Override
    public String toString(){
        return "Je suis une : " + this.name + " qui va te rendre " + this.hp + " points de vie !";
    }
    @Override
    public void interaction(Hero hero) {
        System.out.println("Joliii une petite potion pour reprendre un peu de vie \n" +this);
    }


}
