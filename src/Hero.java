public class Hero {
    private String type;
    private String name;
    private int life;
    private int strength;
    private String offensive;
    private String defensive;

    public Hero() {
        this.name = "Carole";
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

            // condition
            if (type.equalsIgnoreCase("Warrior"))
            {
                this.life = 10;
                this.strength = 10;
                this.offensive = "épée";
                this.defensive = "bouclier";
            }

            if (type.equalsIgnoreCase("Magician"))
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
}
