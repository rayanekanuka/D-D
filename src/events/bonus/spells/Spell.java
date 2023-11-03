package events.bonus.spells;

import characters.Hero;
import events.bonus.EquipementOffensif;
import device.Case;

/**
 * Représente un équipement offensif de type "Sort", pour les Magiciens.
 */
public abstract class Spell extends EquipementOffensif {

    /**
     * Constructeur.
     * @param name le nom du Sort
     */
    public Spell(String name, int attack) {
        // Appelle le constructeur de la classe parent avec le nom du sort et sa force
        super(name, attack);
    }

    public void buff(Hero hero){
        hero.updateMagicalStrength(this);
    }

}
