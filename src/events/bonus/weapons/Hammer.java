package events.bonus.weapons;

import characters.Hero;

public class Hammer extends Weapon{

    public Hammer() {
        super("Massue", 3);
    }

    /**
     * Cette méthode gère l'interaction entre l'arme et un personnage. Uniquement guerrier.
     * @param hero Le personnage avec lequel l'arme interagit.
     */
    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une massue ! \n" + this);
    }


}
