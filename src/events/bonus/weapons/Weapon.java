package events.bonus.weapons;

import characters.EquipementOffensif;
import characters.Hero;
import device.Case;

/**
 * Représente un équipement offensif de type "Arme", pour les Guerriers.
 */
public abstract class Weapon extends EquipementOffensif implements Case {
    protected String name;
    protected int strength;

    /**
     * Constructeur.
     * @param name Le nom de l'Arme
     */
    public Weapon(String name, int strength) {
        // Appelle le constructeur de la classe parent avec le nom de l'arme et sa force.
        super(name, strength);
    }
}