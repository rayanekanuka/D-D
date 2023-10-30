package events.bonus.potions;

import characters.Hero;
import device.Case;

public class MaxPotion extends Potion {
    public MaxPotion(String name, int hp) {
        super(name, hp);
    }

    public MaxPotion() {
        this("Sacrée potion de soin", 5);
    }

    @Override
    public String toString(){
        return "Je suis une : " + this.name + " qui va te rendre " + this.hp + " points de vie !";
    }
    @Override
    public void interaction(Hero hero) {
        System.out.println("Ohlala une SUPER potion pour vous remettre d'aplomb !");
    }

}
