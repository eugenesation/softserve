package com.ua.softserve.entity;

public class Warrior {
    private static int attack = 5;
    private int health = 50;

    public static Warrior of(String clazz) {
        return switch (clazz) {
            case "Warrior" -> new Warrior();
            case "Knight" -> new Knight();
            case "Defender" -> new Defender();
            default -> throw new IllegalArgumentException("Unknown Warrior type: " + clazz);
        };
    }

    public boolean isAlive() {
        return getHealth() > 0;
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

    public void setDamage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack());
    }

    public void attack(Warrior warrior) {
        warrior.setDamage(this);
    }
}
