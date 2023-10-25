package events.bonus;

import device.Case;

// Classe équipement defensif d'un personnage
public abstract class EquipementDefensif implements Case {
    private String name;

    // Constructeur pour créer un équipement offensif avec un nom
    public EquipementDefensif(String name) {
        this.name = name;
    }

    // Getters et Setters pour l'attribut
    public String getName() {
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