package events.bonus;

// Classe équipement défensif d'un personnage
public class EquipementOffensif {
    private String name;
    public EquipementOffensif(String name) {
        this.name = name;
    }

    // Getters et Setters pour l'attribut
    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}