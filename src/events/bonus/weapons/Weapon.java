package events.bonus.weapons;

import characters.EquipementOffensif;
import device.Case;

/**
 * Représente un équipement offensif de type "Arme", pour les Guerriers.
 */
public abstract class Weapon extends EquipementOffensif implements Case {

    /**
     * Constructeur.
     * @param name Le nom de l'Arme
     */
    public Weapon(String name, int strength) {
        // Appelle le constructeur de la classe parent avec le nom de l'arme et sa force.
        super(name, strength);
    }
}