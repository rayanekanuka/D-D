package characters;

public abstract class Hero {
    protected String type;
    protected String name;
    protected int hp;
    protected int strength;
    protected int attack;
    protected String offensive;
    protected String defensive;
    protected int position;

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


//    public Hero() {
//        this.type = "";
//        this.name = "Massimo";
//        this.hp = 10;
//        this.strength = 10;
//        this.offensive = "tomate";
//        this.defensive = "bambou";
//    }
//
//    public Hero(String name) {
//        this.name = name;
//        this.hp = 5;
//        this.strength = 5;
//        this.offensive = "crouton";
//        this.defensive = "brioche";
//    }
//
//      public Hero(String name, String type) {
//            this.name = name;
//            this.type = type;
//
//            // condition
//            if (type.equalsIgnoreCase("Guerrier"))
//            {
//                this.hp = 10;
//                this.strength = 10;
//                this.offensive = "épée";
//                this.defensive = "bouclier";
//            }
//
//            if (type.equalsIgnoreCase("Magicien"))
//            {
//                this.hp = 6;
//                this.strength = 15;
//                this.offensive = "sort";
//                this.defensive = "philtre";
//
//            }
//        }

   @Override
    public String toString() {
        return "[ Vous êtes un " + this.type
                + ", et votre nom est : " + this.name
                + " | Avec " + this.strength + " points de force"
                + " | Avec : " + this.hp + " points de vie"
                + " | Avec : " + this.offensive + " en équipement offensif"
                + " | Et avec : " + this.defensive + " en équipement défensif"
                + " ]";
    }

    // GETTER & SETTER //
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getOffensive() {
        return offensive;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }

    public String getDefensive() {
        return defensive;
    }

    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMinHP() {
        return minHP;
    }

    public void setMinHP(int minHP) {
        this.minHP = minHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public void setMinStrength(int minStrength) {
        this.minStrength = minStrength;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }
}
