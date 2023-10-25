package events.bonus.spells;

import characters.EquipementOffensif;

/**
 * Représente un équipement offensif de type "Sort", pour les Magiciens.
 */
public abstract class Spell extends EquipementOffensif {
    /**
     * Constructeur.
     * param nom
     */
    public Spell(String name) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name);
    }
}
