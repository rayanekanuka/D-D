public class Personnage {
    // je déclare ma classe personnage
    String name;
    String type;
    int vie;
    int force;
    String offensif;
    String defensif;

// j'initialise les propriétés de mon Personnage

    public Personnage() {
        this.name = "Carole";
        this.vie = 10;
        this.force = 10;
        this.offensif = "tomate";
        this.defensif = "bambou";
    }

    public Personnage(String namePerso) {
        this.name = namePerso;
        this.vie = 5;
        this.force = 5;
        this.offensif = "crouton";
        this.defensif = "brioche";
    }

    public Personnage(String namePerso, String type) {
        this.name = namePerso;

        // condition

        if (type("guerrier")) {
            this.vie = 10;
            this.force = 10;
            this.offensif = "épée";
            this.defensif = "bouclier";
        }

        if (type("magicien")){
            this.vie = 6;
            this.force = 15;
            this.offensif = "sort";
            this.defensif = "philtre";

        }
    }

    public static void main(String[] args) {
        Personnage Massimo = new Personnage("Carole", "guerrier");
        System.out.println(Massimo.name);

    }
}

