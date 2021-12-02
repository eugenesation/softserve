package com.ua.softserve.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    @DisplayName("Checking alive method")
    void isAlive() {
        assertTrue(new Warrior().isAlive());
        var warrior = new Warrior();
        warrior.setHealth(-5);
        assertFalse(warrior.isAlive());
        assertTrue(new Knight().isAlive());
        var knight = new Knight();
        knight.setHealth(-10);
        assertFalse(knight.isAlive());
    }

    @Test
    @DisplayName("Getting warriors' attack level")
    void getAttack() {
        var warrior = new Warrior();
        assertEquals(5, warrior.getAttack());
        var knight = new Knight();
        assertEquals(7, knight.getAttack());
    }

    @Test
    @DisplayName("Getting warriors' health amount")
    void getHealth() {
        var warrior = new Warrior();
        assertEquals(50, warrior.getHealth());
        var knight = new Knight();
        assertEquals(50, knight.getHealth());
    }

    @Test
    @DisplayName("Setting warriors' health amount")
    void setHealth() {
        var warrior = new Warrior();
        warrior.setHealth(30);
        assertEquals(30, warrior.getHealth());
        var knight = new Knight();
        knight.setHealth(20);
        assertEquals(20, knight.getHealth());
    }
}