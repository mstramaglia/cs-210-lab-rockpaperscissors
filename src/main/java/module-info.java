module edu.miracosta.cs210.rockpaperscissorslab {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    exports edu.miracosta.cs210.rockpaperscissorslab;
    opens edu.miracosta.cs210.rockpaperscissorslab to javafx.fxml;
}