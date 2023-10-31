package events.bonus.weapons;


import characters.Hero;

public class Sword extends Weapon {

    public Sword() {
        super("Epée", 5);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une épée \n" + this);
    }

    @Override
    public String toString() {
        return "Cette " + this.name + " avec : " + this.strength + " de points de force !";
    }
}
