package com.ua.softserve;

import com.ua.softserve.entity.Knight;
import com.ua.softserve.entity.Warrior;
import com.ua.softserve.service.Battle;

public class Main {

    public static void main(String[] args) {
        var warrior = new Warrior();
        var knight = new Knight();
        System.out.println(Battle.fight(warrior, knight));
    }

}
