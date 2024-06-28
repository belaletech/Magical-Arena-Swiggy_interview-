package org.example;

public class Player {
    private int health;
    private final int strength;
    private final int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getStrength() { return strength; }
    public int getAttack() { return attack; }

    public int attack() { return rollDice() * attack; }
    public int defend() { return rollDice() * strength; }

    private int rollDice() { return (int) (Math.random() * 6) + 1; }
}
