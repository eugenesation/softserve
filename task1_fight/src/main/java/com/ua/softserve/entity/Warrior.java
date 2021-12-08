package com.ua.softserve.entity;

public class Warrior {
    private static final int ATTACK = 5;
    private int health = 50;

    public static Warrior of(String clazz) {
        return switch (clazz) {
            case "Warrior" -> new Warrior();
            case "Knight" -> new Knight();
            case "Defender" -> new Defender();
            case "Vampire" -> new Vampire();
            default -> throw new IllegalArgumentException("Unknown Warrior type: " + clazz);
        };
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public int getAttack() {
        return ATTACK;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getDamage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack());
        return getHealth();
    }

    public void attack(Warrior warrior) {
        warrior.getDamage(this);
    }
}
