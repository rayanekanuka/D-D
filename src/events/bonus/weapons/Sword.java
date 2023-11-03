package events.bonus.weapons;


import characters.Hero;
import characters.Warrior;

public class Sword extends Weapon {

    public Sword() {
        super("Epée", 5);
    }

    /**
     * Cette méthode gère l'interaction entre l'arme et un personnage. Uniquement guerrier.
     * @param hero Le personnage avec lequel l'arme interagit.
     */
    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une épée \n" + this);
        if (hero instanceof Warrior) {
            System.out.println("Une bien belle épée que voilà !");
            buff(hero);
            System.out.println("Vous passez à " + hero.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu ne peux pas te servir de ça petit homme en robe");
        }

    }

}
