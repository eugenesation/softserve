package com.ua.softserve.entity;

public class Defender extends Warrior {
    private static final int ATTACK = 3;
    private static final int DEFENCE = 2;

    public Defender() {
        setHealth(60);
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    public static int getDefence() {
        return DEFENCE;
    }

    @Override
    public int getDamage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack() + getDefence());
        return getHealth();
    }
}
