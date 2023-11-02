package characters;

import device.Fight;
import events.bonus.weapons.Weapon;

/**
 * Classe parent de Warrior et Magician, le Hero constructeur et les méthodes sont utilisées par les enfants
 */

public abstract class Hero implements Fight {

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

    /**
     * Constructeur pour Intialiser les attributs commus à tous les héros
     * @param name Le nom de mon constructeur Hero
     * @param hp Health Points
     * @param strength Force
     * @param attack Attaque
     * @param type Type
     */

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
     * Constrcuteur de Hero,
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

    /**
     *
     * @return le type de mon Héros
     */
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

    /**
     *
     * @param name retourne le nom du héros choisi
     */
    public void setName(String name) {

        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    /**
     *
     * @param hp Health Points que j'initialise avec les min et max
     */

    public void setHp(int hp) {
        if (hp > this.maxHP) {
            this.hp = this.maxHP;
        } else if (hp < this.minHP) {
            this.hp = this.minHP;
        } else {
            this.hp = hp;
        }
    }

    /**
     *
     * @return getter de ma force
     */

    public int getStrength() {
        return strength;
    }

    /**
     *
     * @param strength setter pour ma force
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     *
     * @return récupère l'arme choisie
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     *
     * @param weapon setter de l'arme choisie
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     *
     * @return retourne les points d'attaque
     */
    public int getAttack() {
        return attack;
    }

    /**
     *
     * @param attack setter pour les points d'attaque
     */

    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *
     * @return retourne la position du joueur
     */

    public int getPosition() {
        return position;
    }

    /**
     *
     * @param position set la position du joueur
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     *
     * @return un String donc des phrases à l'affichage
     */
    @Override
    public String toString() {
        return "[ --------- Vous êtes un " + type + " --------- ]\n"
                + " --- Votre nom est : " + name + " --- \n"
                + " [ Avec : " + strength + " points de force"
                + " | Avec : " + hp + " points de vie"
                + " | Et avec : " + weapon + " en équipement offensif"
                + " ]";
    }

    @Override
    public void receive(Fight fighter) {
        this.hp -= fighter.getAttack();
    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }
}
