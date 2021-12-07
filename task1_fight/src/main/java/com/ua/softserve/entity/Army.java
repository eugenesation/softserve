package com.ua.softserve.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Army {

    List<Warrior> units = new ArrayList<>();

    public Army addUnits(String classWarrior, int count) {
        for (int i = 0; i < count; i++) {
            Warrior warrior = Warrior.of(classWarrior);
            units.add(warrior);
        }
        return this;
    }

    public Optional<Warrior> getFirstAlive() {
        return units.stream().filter(Warrior::isAlive).findFirst();
    }

}
