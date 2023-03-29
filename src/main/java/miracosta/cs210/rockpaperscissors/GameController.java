package miracosta.cs210.rockpaperscissors;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GameController {

    @FXML
    private TextField playerMove;
    @FXML
    private TextField computerMove;

    @FXML
    private TextField winner;

    @FXML
    protected void onRockButtonClick() {
        playerMove.setText("Rock");
        RockPaperScissors game = new RockPaperScissors();
        game.play("rock");
    }

    @FXML
    protected void onPaperButtonClick() {
        playerMove.setText("Paper");
        RockPaperScissors game = new RockPaperScissors();
        game.play("paper");
    }

    @FXML
    protected void onScissorsButtonClick() {
        playerMove.setText("Scissors");
        RockPaperScissors game = new RockPaperScissors();
        game.play("scissors");
    }
}