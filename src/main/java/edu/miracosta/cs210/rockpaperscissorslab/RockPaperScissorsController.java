package edu.miracosta.cs210.rockpaperscissorslab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RockPaperScissorsController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onRockButtonClick() {
        RockPaperScissorsAPI api = new RockPaperScissorsAPI();
        String response = api.playGame("rock");
        //System.out.println("You chose rock!");
    }

    @FXML
    protected void onPaperButtonClick() {
        RockPaperScissorsAPI api = new RockPaperScissorsAPI();
        String response = api.playGame("paper");
    }
}