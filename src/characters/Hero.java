package characters;

import events.bonus.weapons.Weapon;

/**
 * Classe parent de Warrior et Magician, le Hero constructeur et les méthodes sont utilisées par les enfants
 */

public abstract class Hero {

    protected String type;
    protected String name;
    protected int hp;
    protected int strength;
    protected int attack;
    protected Weapon weapon;
    protected int position;
    protected String offensive;
    protected String defensive;

    protected int minHP;
    protected int maxHP;
    protected int minStrength;
    protected int maxStrength;

    public Hero(String name, int hp, int strength, int attack, String type) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
        this.type = type;
        this.minHP = 5;
        this.maxHP = 10;
        this.minStrength = 5;
        this.maxStrength = 10;
    }

    /**
     * Fonction principale de Hero,
     * @param name Nom du perso
     * @param hp Health Points
     * @param strength Force du perso
     * @param attack Attaque
     * @param type Type de perso
     * @param minHP min Health Points
     * @param maxHP max Health Points
     * @param minStrength min Force
     * @param maxStrength max Force
     */
    public Hero(String name, int hp, int strength, int attack, String type, int minHP, int maxHP, int minStrength, int maxStrength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
        this.type = type;
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
    }

    // GETTER & SETTER //
    public String getType() {
        return type;
    }

    /**
     *
     * @return le nom de mon Héros
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setHp(int hp) {
        if (hp > this.maxHP) {
            this.hp = this.maxHP;
        } else if (hp < this.minHP) {
            this.hp = this.minHP;
        } else {
            this.hp = hp;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "[ --------- Vous êtes un " + this.type + " --------- ]\n"
                + " --- Votre nom est : " + this.name + " --- \n"
                + " [ Avec : " + this.strength + " points de force"
                + " | Avec : " + this.hp + " points de vie"
                + " | Avec : " + this.offensive + " en équipement offensif"
                + " | Et avec : " + this.defensive + " en équipement défensif"
                + " ]";
    }

}
