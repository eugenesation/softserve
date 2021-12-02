package com.ua.softserve.entity;

public class Warrior {

    private static int attack = 5;
    private int health = 50;

    public boolean isAlive() {
        return health > 0;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
