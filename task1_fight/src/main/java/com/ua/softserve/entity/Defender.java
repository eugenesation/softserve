package com.ua.softserve.entity;

public class Defender extends Warrior {
    private int health = 60;
    private static int attack = 3;
    private static int defence = 2;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public static int getDefence() {
        return defence;
    }

    @Override
    public void setDamage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack() + getDefence());
    }
}
