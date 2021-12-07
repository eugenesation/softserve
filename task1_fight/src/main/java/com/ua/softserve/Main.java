package com.ua.softserve;

import com.ua.softserve.entity.Army;
import com.ua.softserve.entity.Defender;
import com.ua.softserve.entity.Knight;
import com.ua.softserve.entity.Warrior;
import com.ua.softserve.service.Battle;

public class Main {

    public static void main(String[] args) {
        var army = new Army()
                .addUnits("Warrior", 20)
                .addUnits("Knight", 5);
        var army2 = new Army()
                .addUnits("Warrior", 25);
        var result = Battle.fight(army, army2);
        System.out.println(result);
    }
}
