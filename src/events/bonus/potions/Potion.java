package events.bonus.potions;

import characters.EquipementDefensif;
import device.Case;

/**
 * Représente un équipement défensif de type "Potion", pour les Héros.
 */
public abstract class Potion extends EquipementDefensif {

    protected String name;
    protected int hp;
    /**
     * Constructeur.
     * @param name le nom de la Potion
     * @param hp Health Points
     */
    public Potion(String name, int hp) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name, hp);
    }
}
