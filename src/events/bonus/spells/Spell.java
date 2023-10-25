package events.bonus.spells;

import characters.Hero;
import events.bonus.EquipementOffensif;

/**
 * Représente un équipement offensif de type "Sort", pour les Magiciens.
 */
public class Spell extends EquipementOffensif {
    /**
     * Constructeur.
     * param nom
     */
    public Spell(String name) {
        // Appelle le constructeur de la classe parent avec le nom du sort, pour le moment qu'un nom, mais il y aura bien d'autres choses plus tard.
        super(name);
    }

    /**
     * param Hero
     */

    public void interaction(Hero hero) {

    }
}
