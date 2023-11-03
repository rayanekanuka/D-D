package events.bonus.spells;

import characters.Hero;
import characters.Magician;

public class FireBall extends Spell {

    public FireBall() {
        super("Boule de Feu", 7);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vite saisissez cette Boule de Feu ! \n" + this);
        if (hero instanceof Magician) {
            System.out.println("What a damn Salamèche!");
            buff(hero);
            System.out.println("Vous passez à " + hero.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu n'a pas le QI pour l'utiliser musclor");

        }
    }

    @Override
    public String toString() {
        return "Une " + this.name + " va s'abattre, avec : " + this.strength + " de points de force !";
    }
}
