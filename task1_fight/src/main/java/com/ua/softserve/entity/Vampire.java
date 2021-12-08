package com.ua.softserve.entity;

public class Vampire extends Warrior {
    private static final int VAMPIRISM = 50;
    private static final int ATTACK = 4;

    public Vampire() {
        setHealth(40);
    }

    public int getVampirism() {
        return VAMPIRISM;
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    @Override
    public void attack(Warrior warrior) {
        int damage = warrior.getHealth() - warrior.getDamage(this);
        restoreHealth(damage);
    }

    private void restoreHealth(int damage) {
        setHealth(getHealth() + damage * getVampirism() / 100);
        if (getHealth() > 40) {
            setHealth(40);
        }
    }
}
