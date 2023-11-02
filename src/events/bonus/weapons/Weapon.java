package events.bonus.weapons;

import characters.Hero;
import device.Case;
import events.bonus.EquipementOffensif;

/**
 * Représente un équipement offensif de type "Arme", pour les Guerriers.
 */
public abstract class Weapon extends EquipementOffensif {

    /**
     * Constructeur de la classe Arme
     * @param name Le nom de l'Arme
     * @param strength force d'Attaque associée à l'arme
     */
    public Weapon(String name, int strength) {
        // Appelle le constructeur de la classe parent avec le nom de l'arme et sa force.
        super(name, strength);
    }

    @Override
    public String toString() {
        return "Prends cette " + this.name + " avec : " + this.strength + " de points de force !";
    }



}