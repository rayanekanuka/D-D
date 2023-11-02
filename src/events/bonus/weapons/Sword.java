package events.bonus.weapons;


import characters.Hero;

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
    }

}
