package com.ua.softserve.util;

import com.ua.softserve.entity.Army;
import com.ua.softserve.entity.Warrior;

public class Battle {

    private Battle() {
    }

    public static boolean fight(Warrior warrior1, Warrior warrior2) {
        Warrior attacker = warrior1;
        Warrior defender = warrior2;
        while (attacker.isAlive()) {
            attacker.attack(defender);
            var swap = attacker;
            attacker = defender;
            defender = swap;
        }
        return warrior1.isAlive();
    }

    public static boolean fight(Army army1, Army army2) {
        while (true) {
            var attacker = army1.getFirstAlive();
            if (attacker.isEmpty()) {
                return false;
            }
            var defender = army2.getFirstAlive();
            if (defender.isEmpty()) {
                return true;
            }
            fight(attacker.get(), defender.get());
        }
    }

}
