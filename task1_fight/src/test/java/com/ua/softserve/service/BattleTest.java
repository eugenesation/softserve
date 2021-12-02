package com.ua.softserve.service;

import com.ua.softserve.entity.Knight;
import com.ua.softserve.entity.Warrior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @Test
    @DisplayName("Battle between warrior and knight. Knight has won and attacks second so it should return false")
    void fight() {
        var warrior = new Warrior();
        var knight = new Knight();

        var res = Battle.fight(warrior, knight);

        assertFalse(res);
    }

    @Test
    @DisplayName("Battle between knight and warrior. Knight has won and attacks first so it should return true")
    void secondFight() {
        var warrior = new Warrior();
        var knight = new Knight();

        var res = Battle.fight(knight, warrior);

        assertTrue(res);
    }
}