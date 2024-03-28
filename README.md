# cs-210-lab-rockpaperscissors
Rock Paper Scissors using API

## Overview

This is a partially completed JavaFX program for a Rock, Paper, Scissors game.  The JavaFX user interface is already built, with buttons to allow the player to select their move.

There is a `RockPaperScissors.java` class file which we want to use to connect to an API for simulating Rock, Paper, Scissors games.  The URL for the API is:

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

Update the `RockPaperScissors.java` so that it connects to the API URL, passing the player move as a URL property, and then parse the JSON response, setting the appropriate instance variables for `playerMove`, `computerMove`, and `winner`.

Update `GameController.java` setting the FXML TextField elements for computerMove and winner using the values in the `RockPaperScisssors` game object after the game has been played.
