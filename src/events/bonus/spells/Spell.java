package events.bonus.spells;

import characters.EquipementOffensif;
import device.Case;

/**
 * Représente un équipement offensif de type "Sort", pour les Magiciens.
 */
public abstract class Spell extends EquipementOffensif implements Case {
    /**
     * Constructeur.
     * @param name le nom du Sort
     */
    public Spell(String name, int attack) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name, attack);
    }
}
