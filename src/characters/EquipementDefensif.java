package characters;

import device.Case;

/**
 * Cette classe abstraite représente un équipement défensif.
 * Pour le moment, il n'est pas utilisé de manière intéressante.
 */
public abstract class EquipementDefensif implements Case {
    protected String name;
    protected int hp;

    /**
     * Constructeur de la classe EquipementDefensif.
     * @param name Le nom de l'équipement défensif.
     * @param hp Le niveau de vie associé à l'équipement.
     */
    protected EquipementDefensif(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    // Getters et Setters

    /**
     * Obtient Le nom de l'équipement défensif.
     * @return Le nom de l'équipement défensif.
     */
    public String getName() {
        return name;
    }

    /**
     * Définit Le nom de l'équipement défensif.
     * @param name Le nouveau nom de l'équipement défensif.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Méthode d'interaction entre l'équipement défensif et un perso.
     * @param hero Le perso avec lequel l'équipement défensif interagit.
     */
    @Override
    public void interaction(Hero hero) {    }

    /**
     * Retourne un String de l'équipement défensif.
     * @return Une REPRESENTATION en String de l'équipement défensif.
     */
    @Override
    public String toString() {
        return name;
    }
}