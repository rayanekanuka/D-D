package events.bonus;

import device.Case;

/**
 * Cette classe ABSTRAITE représente un équipement offensif utilisé par TOUS les perso.
 */
public abstract class EquipementOffensif implements Case {

    protected String name;
    protected int strength;

    /**
     * Constructeur de la classe EquipementOffensif.
     * @param name Le nom de l'équipement.
     * @param strength La force d'attaque associée à l'équipement.
     */
    protected EquipementOffensif(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return name;
    }


    // Getters et Setters

    /**
     * Définit le nom.
     * @param name Le nouveau nom de l'équipement offensif.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne le String de l'équipement.
     * @return le nom de l'équipement offensif.
     */

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}