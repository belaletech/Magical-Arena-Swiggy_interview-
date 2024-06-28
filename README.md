# Magical Arena

## Overview
This project is a simulation of a magical arena where two players fight until one of them dies.

## How to Run
1. Compile the project using your preferred IDE or command line.
2. Run the `Main` class to start the simulation.

## How to Test
1. Ensure JUnit is included in your project dependencies.
2. Run the test classes (`PlayerTest` and `ArenaTest`) to execute unit tests.

## Design Decisions
- **Player Class**: Represents a player with health, strength, and attack attributes.
- **Arena Class**: Manages the fight between two players.
- **Main Class**: Entry point of the application.

## Assumptions
- Dice rolls are simulated using random numbers between 1 and 6.
- Players attack and defend in turns, starting with the player with lower health.

## Commit History
Frequent commits with descriptive messages were made to track the development progress.

## Dependencies
- Java
- JUnit (for testing)
