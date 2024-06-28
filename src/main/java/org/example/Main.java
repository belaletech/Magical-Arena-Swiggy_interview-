package org.example;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        Player winner = arena.fight(playerA, playerB);
        arena.printWinner(winner, playerA, playerB);
    }
}
