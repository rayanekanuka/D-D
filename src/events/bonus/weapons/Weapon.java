package events.bonus.weapons;

import characters.EquipementOffensif;

/**
 * Représente un équipement offensif de type "Arme", pour les Guerriers.
 */
public abstract class Weapon extends EquipementOffensif {
    /**
     * Constructeur.
     * @param name Le nom de l'Arme
     */
    public Weapon(String name) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name);
        System.out.println(name);
    }
}
