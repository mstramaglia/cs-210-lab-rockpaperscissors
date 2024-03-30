# cs-210-lab-rockpaperscissors
Rock Paper Scissors using API

## Overview

This is a partially completed JavaFX program for a Rock, Paper, Scissors game.  The JavaFX user interface is already built, with two of the three buttons already present to allow the player to select their move.

There is a `RockPaperScissorsAPI.java` class file which we want to use to connect to an API for simulating Rock, Paper, Scissors games.  The URL for the API is:

```
https://cs210-rock-paper-scissors.replit.app/play?choice=rock
```

Where the choice can be one of the following three valid options:
* `rock`
* `paper`
* `scissors`

Performing a `GET` against that URL should cause the API to generate a move for the computer player, evaluate the winner, and return a JSON response similar to the following:

```
{
    "computer_choice": "rock",
    "player_choice": "paper",
    "winner": "Player wins!"
}
```

## Instructions

Update the `game.fxml` file, using SceneBuilder to add the remaining button as well as a label or text box for showing the winner whenever the game is played.

Update the `RockPaperScissorsController.java` and `RockPaperScissorsAPI.java` files as needed to make sure that the API is returning the results of the game as a String, and when the appropriate buttons are pressed in the GUI, the API is called to play the game, and the results of the game are displayed to the user in the GUI.

Push your updated lab back to version control once you've completed it.
