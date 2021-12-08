package com.ua.softserve;

import com.ua.softserve.entity.*;
import com.ua.softserve.util.Battle;

public class Main {

    public static void main(String[] args) {
        var defender = new Defender();
        var vampire = new Vampire();
        System.out.println(Battle.fight(defender, vampire));
    }
}
