# Tic Tac Toe

## Overview

This is a simple Tic Tac Toe game implemented in Java using the Swing library for the graphical user interface (GUI). The game allows two players to take turns marking their spots on a 3x3 grid until one player wins or the game ends in a draw.

## Features

- Two-player gameplay (X and O).
- Graphical interface with a grid layout.
- Visual indication of the winning player.
- Background color and button colors for a better user experience.

## Technologies Used

- Java
- Swing (for GUI)
- AWT (for layout and event handling)

## Installation

1. Make sure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.
2. Clone the repository or download the source code.
3. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).
4. Compile the code and run the `TicTacToe` class.

## How to Play

1. The game starts with a prompt indicating which player's turn it is (X or O).
2. Players take turns clicking on the empty buttons in the grid to place their marks.
3. The first player to align three of their marks horizontally, vertically, or diagonally wins the game.
4. If all spots are filled without a winner, the game ends in a draw.

## Code Structure

- `TicTacToe.java`: The main class containing the game logic and GUI components.

## Future Improvements

- Add an AI opponent for single-player mode.
- Implement a scoring system to track wins and losses.
- Allow for game resets without restarting the application.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
