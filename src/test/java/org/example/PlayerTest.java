package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player(50, 5, 10);
    }

    @Test
    public void testAttack() {
        int attackValue = player.attack();
        assertTrue(attackValue >= 10 && attackValue <= 60);
    }

    @Test
    public void testDefend() {
        int defendValue = player.defend();
        assertTrue(defendValue >= 5 && defendValue <= 30);
    }

    @Test
    public void testHealthModification() {
        player.setHealth(30);
        assertEquals(30, player.getHealth());
    }
}

