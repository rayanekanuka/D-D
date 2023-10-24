package characters;

public class Hero {

    private String type;
    private String name;
    private int life;
    private int strength;
    private String offensive;
    private String defensive;

    public Hero() {
        this.type = "";
        this.name = "Massimo";
        this.life = 10;
        this.strength = 10;
        this.offensive = "tomate";
        this.defensive = "bambou";
    }

    public Hero(String name) {
        this.name = name;
        this.life = 5;
        this.strength = 5;
        this.offensive = "crouton";
        this.defensive = "brioche";
    }

      public Hero(String name, String type) {
            this.name = name;
            this.type = type;

            // condition
            if (type.equalsIgnoreCase("Guerrier"))
            {
                this.life = 10;
                this.strength = 10;
                this.offensive = "épée";
                this.defensive = "bouclier";
            }

            if (type.equalsIgnoreCase("Magicien"))
            {
                this.life = 6;
                this.strength = 15;
                this.offensive = "sort";
                this.defensive = "philtre";

            }
        }

    public String toString() {
        return "[ Vous êtes un " + this.type
                + ", et votre nom est : " + this.name
                + " | Avec " + this.strength + " points de force"
                + " | Avec : " + this.life + " points de vie"
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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


}
