package com.ua.softserve.service;

import com.ua.softserve.entity.Warrior;

public class Battle {

    private Battle() {
    }

    public static boolean fight(Warrior warrior1, Warrior warrior2) {
        while (true) {
            if (warrior1.isAlive()) {
                warrior1.attack(warrior2);
            } else {
                return false;
            }
            if (warrior2.isAlive()) {
                warrior2.attack(warrior1);
            } else {
                return true;
            }
        }

    }

}
