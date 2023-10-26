package events.bonus.potions;

import characters.EquipementDefensif;

/**
 * Représente un équipement défensif de type "Potion", pour les Héros.
 */
public abstract class Potion extends EquipementDefensif {
    /**
     * Constructeur.
     * @param name le nom de la Potion
     */
    public Potion(String name) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name);
    }
}
