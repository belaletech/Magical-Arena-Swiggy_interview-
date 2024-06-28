package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {
    private Player playerA;
    private Player playerB;
    private Arena arena;

    @Before
    public void setUp() {
        playerA = new Player(50, 5, 10);
        playerB = new Player(100, 10, 5);
        arena = new Arena();
    }

    @Test
    public void testDetermineFirstAttacker() {
        Player firstAttacker = arena.determineFirstAttacker(playerA, playerB);
        assertEquals(playerA, firstAttacker);
    }

    @Test
    public void testTakeTurn() {
        int initialHealthB = playerB.getHealth();
        arena.takeTurn(playerA, playerB);
        assertTrue(playerB.getHealth() <= initialHealthB);

        int initialHealthA = playerA.getHealth();
        arena.takeTurn(playerB, playerA);
        assertTrue(playerA.getHealth() <= initialHealthA);
    }

    @Test
    public void testFight() {
        Player winner = arena.fight(playerA, playerB);
        assertTrue(winner == playerA || winner == playerB);
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }
}
