package events.enemies;

import characters.Hero;
import device.Case;
import device.Fight;

import java.util.Random;
import java.util.Scanner;

public abstract class Enemy implements Case, Fight {

    protected String name;
    protected int hp;
    protected int strength;



    public Enemy(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public void attack(Hero hero) {
        System.out.println("Vous tombez nez à nez avec un terrifiant " + this.name + " !");

        while ((hero.isAlive()) && (this.isAlive())) {
            Scanner fight = new Scanner(System.in);
            System.out.println("Souhaitez-vous Combattre (C) ou Fuir (F) ?");
            String answer = fight.nextLine().toUpperCase();
            if (answer.equals("C")) {
                this.hp = this.hp - hero.getStrength();
                if (hero.getHp() <= 0) {
                    System.out.println("GOOOSH TU AS BESOIN D'UN REMONTANT !");
                    break;
                }

                if (this.hp <= 0) {
                    System.out.println(this.name + " est complètement mort | fait gaffe tu n'as plus que " + (hero.getHp() - this.strength) + " points de vie !");
                    break;
                } else if (hero.getHp() <= 0) {
                    System.out.println("Zut t'es mort =/ ");
                    break;
                } else {
                    System.out.println("Vous venez de l'attaquer, il vous reste toujours " + hero.getHp() + " points de vie et " + this.hp + " au " + this.name + " mais attention il se prépare à riposter ");
                    hero.setAttack(hero.getHp() - this.strength);
                    System.out.println("Vous vous êtes fait attaqué de " + this.strength);
                    System.out.println("Votre vie est désormais de " + (hero.getHp() - this.strength));
                }
            } else if (answer.equals("F")) {
                Random rand = new Random();
                int pose = rand.nextInt(6) + 1;
                System.out.println("Vous avez fuit de la case " + hero.getPosition() + " jusqu'à" + " vous retrouver sur la case " + (hero.getPosition() - pose));
                runAway(hero, (hero.getPosition() - pose));
                break;
            }
        }
    }


    @Override
    public String toString() {
        return " [ Ennemi = '" + name + '\'' +
                ", Points de vie = " + hp +
                ", Force d'Attaque = " + strength +
                " ]";
    }

    public void runAway(Hero hero, int position) {
        hero.setPosition(position);
    }


    // GETTER & SETTER

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

    @Override
    public void interaction(Hero hero) {
        attack(hero);
    }

    @Override
    public int getAttack() {
        return this.strength;
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
