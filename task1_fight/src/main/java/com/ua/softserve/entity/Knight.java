package com.ua.softserve.entity;

public class Knight extends Warrior{
    private static int attack = 7;

    @Override
    public int getAttack() {
        return attack;
    }
}
