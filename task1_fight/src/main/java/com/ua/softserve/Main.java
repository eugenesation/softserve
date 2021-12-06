package com.ua.softserve;

import com.ua.softserve.entity.Defender;
import com.ua.softserve.entity.Knight;
import com.ua.softserve.entity.Warrior;
import com.ua.softserve.service.Battle;

public class Main {

    public static void main(String[] args) {
          var defender2 = new Defender();
          var knight = new Knight();
          var warrior = new Warrior();
        System.out.println(Battle.fight(warrior, defender2));
    }

}
