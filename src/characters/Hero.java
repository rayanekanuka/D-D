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

    /**
     * Attributs de la classe Hero
     */

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
     * Constructeur pour Initialiser les attributs communs à tous les héros
     * @param name Nom du perso
     * @param hp Health Points
     * @param strength Force du perso
     * @param attack Attaque
     * @param type Type de perso
     * @param minHP min Health Points
     * @param maxHP max Health Points
     * @param minStrength min Force
     * @param maxStrength max Force
     * @param equipementOffensif équipement Offensif
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
     * Constructeur pour Initialiser les attributs communs à tous les héros
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
        this.maxHP = 15;
        this.minStrength = 0;
        this.maxStrength = 15;
    }


    // GETTER & SETTER //

    /**
     * Méthode qui update les Health Points du joueur s'il prend une potion
     * @param potion
     */
    public void updateHp(Potion potion) {
        if ((this.getHp() + potion.getHp() > this.maxHP)) {
            System.out.println("Vous avez déjà trop de vie pour en reprendre gouja !");
        } else {
            this.setHp(this.getHp() + potion.getHp());
        }
    }

    /**
     * Méthode qui update la force d'attaque du Guerrier dès qu'il prend une arme
     * @param equipementOffensif
     */
    public void updatePhysicalStrength(EquipementOffensif equipementOffensif) {
        this.setStrength(this.getStrength() + equipementOffensif.getStrength());
    }

    /**
     * Méthode qui update la force d'attaque du Magicien dès qu'il prend un sort
     * @param spell
     */
    public void updateMagicalStrength(Spell spell) {
        this.setStrength(this.getStrength() + spell.getStrength());
    }

    /**
     *
     * @return le type du personnage
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return le nom du personnage
     */
    public String getName() {
        return name;
    }

    /**
     * Modifie le nom du personnage
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtient le niveau de vie
     * @return les Health Points
     */
    public int getHp() {
        return hp;
    }

    /**
     *
     * @param hp Health Points que j'initialise avec les min et max
     *           Définit le niveau de vie min et max du personnage
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
     * @return la force d'attaque du personnage
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Modifie la force d'attaque du personnage
     * @param strength Force que j'initialise avec les min et max
     *                 Définit le niveau min et max de la force d'attaque
     */

    public void setStrength(int strength) {
        if (strength > maxStrength) {
            this.strength = this.maxStrength;
        } else if (strength < minStrength) {
            this.strength = this.minStrength;
        } else {
            this.strength = strength;
        }
    }

    /**
     * Définit l'équipement offensif du personnage
     * @return
     */
    public EquipementOffensif getEquipementOffensif() {
        return equipementOffensif;
    }

    /**
     * Modifie l'équipement offensif du personnage
     * @param equipementOffensif
     */
    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    /**
     *
     * @return le nombre de points d'attaque
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Modifie le nombre de points d'attaque
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *
     * @return La position du joueur
     */
    public int getPosition() {
        return position;
    }

    /**
     * Modifie la position du joueur
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Méthode qui rassemble toutes les informations du personnage sous format texte
     * @return les informations du personnage
     */
    @Override
    public String toString() {
        return "[ --------- Vous êtes un " + type + " --------- ]\n"
                + " --- Votre nom est : " + name + " --- \n"
                + " [ Avec : " + strength + " points de force"
                + " | Avec : " + hp + " points de vie"
                + " | " + equipementOffensif
                + " ]";
    }

    /**
     * Méthode qui sert à encaisser les coups
     * @param fighter qui encaisse les coups
     */
    @Override
    public void receive(Fight fighter) {
        this.hp -= fighter.getAttack();
    }

    /**
     * Méthode sous format de booléen qui permet de savoir si le personnage est vivant ou mort
     * @return si le personnage est vivant
     */
    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }
}
