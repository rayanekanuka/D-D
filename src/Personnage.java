public class Personnage {
    String nom;
    String type;
    int vie;
    int force;
    String offensif;
    String defensif;

    public Personnage() {
        this.nom = "Carole";
        this.vie = 10;
        this.force = 10;
        this.offensif = "tomate";
        this.defensif = "bambou";
    }

    public Personnage(String nomPerso) {
        this.nom = nomPerso;
        this.vie = 5;
        this.force = 5;
        this.offensif = "crouton";
        this.defensif = "brioche";
    }

/*    public Personnage(String nomPerso, String type) {
        this.nom = nomPerso;

        // condition
        if (type(equalsIgnoreCase("guerrier"));
        {
            this.vie = 10;
            this.force = 10;
            this.offensif = "épée";
            this.defensif = "bouclier";
        }

        if (type(equalsIgnoreCase("magicien"));
        {
            this.vie = 6;
            this.force = 15;
            this.offensif = "sort";
            this.defensif = "philtre";

        }
    }

 */
    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", vie=" + vie +
                ", force=" + force +
                ", offensif='" + offensif + '\'' +
                ", defensif='" + defensif + '\'' +
                '}';
    }
}


