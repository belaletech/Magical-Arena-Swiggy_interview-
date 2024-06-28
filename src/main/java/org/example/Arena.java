package org.example;

public class Arena {

        public void startFight(Player playerA, Player playerB) {
            Player firstAttacker = determineFirstAttacker(playerA, playerB);
            Player secondAttacker = (firstAttacker == playerA) ? playerB : playerA;

            while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
                takeTurn(firstAttacker, secondAttacker);
                if (secondAttacker.getHealth() > 0) {
                    takeTurn(secondAttacker, firstAttacker);
                }
            }

            declareWinner(playerA, playerB);
        }

        public Player determineFirstAttacker(Player playerA, Player playerB) {
            return (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        }

        public void takeTurn(Player attacker, Player defender) {
            int attackDamage = attacker.attack();
            int defendDamage = defender.defend();
            int damageDealt = attackDamage - defendDamage;

            if (damageDealt > 0) {
                defender.setHealth(defender.getHealth() - damageDealt);
            }
        }

        private void declareWinner(Player playerA, Player playerB) {
            if (playerA.getHealth() <= 0) {
                System.out.println("Player B wins!");
            } else {
                System.out.println("Player A wins!");
            }
        }
}

