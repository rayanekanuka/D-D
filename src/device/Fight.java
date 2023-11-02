package device;

public interface Fight {
    // donne un nombre de points d'attaque
    int getAttack();

    // encaisser un coup
    void receive(Fight fighter);

    // savoir si on est vivant ou mort ?
    boolean isAlive();
}
