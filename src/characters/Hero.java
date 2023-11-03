package characters;

import device.Fight;
import events.bonus.EquipementOffensif;
import events.bonus.potions.Potion;
import events.bonus.spells.Spell;
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
    protected EquipementOffensif equipementOffensif;
    protected int position;
    protected int minHP;
    protected int maxHP;
    protected int minStrength;
    protected int maxStrength;

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
    public Hero(String name, int hp, int strength, int attack, String type, int minHP, int maxHP, int minStrength, int maxStrength, EquipementOffensif equipementOffensif) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attack = attack;
        this.type = type;
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
        this.equipementOffensif = equipementOffensif;
    }

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
        this.minHP = 0;
        this.maxHP = 10;
        this.minStrength = 0;
        this.maxStrength = 10;
    }




    // GETTER & SETTER //

    public void updateHp(Potion potion) {
        if ((this.getHp() + potion.getHp() < this.maxHP)) {
            System.out.println("Vous avez déjà trop de vie pour en reprendre gouja !");
        } else {
            this.setHp(this.getHp() + potion.getHp());
        }
    }

    public void updatePhysicalStrength(EquipementOffensif equipementOffensif) {
        this.setStrength(this.getStrength() + equipementOffensif.getStrength());
    }

    public void updateMagicalStrength(Spell spell) {
        this.setStrength(this.getStrength() + spell.getStrength());
    }

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
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > maxStrength) {
            this.strength = this.maxStrength;
        } else if (strength < minStrength) {
            this.strength = this.minStrength;
        } else {
            this.strength = strength;
        }
    }

    public EquipementOffensif getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
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
        return "[ --------- Vous êtes un " + type + " --------- ]\n"
                + " --- Votre nom est : " + name + " --- \n"
                + " [ Avec : " + strength + " points de force"
                + " | Avec : " + hp + " points de vie"
                + " | Et avec : " + equipementOffensif + " en équipement offensif"
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
