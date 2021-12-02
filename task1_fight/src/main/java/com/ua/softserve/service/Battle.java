package com.ua.softserve.service;

import com.ua.softserve.entity.Warrior;

public class Battle {
    public static boolean fight(Warrior warrior1, Warrior warrior2) {
        while (warrior1.isAlive() && warrior2.isAlive()) {
            warrior2.setHealth(warrior2.getHealth() - warrior1.getAttack());
            warrior1.setHealth(warrior1.getHealth() - warrior2.getAttack());
        }
        return warrior1.isAlive();

    }

}
