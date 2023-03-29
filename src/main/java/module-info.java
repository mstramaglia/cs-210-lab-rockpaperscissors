module miracosta.cs210.rockpaperscissors {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires json;


    opens miracosta.cs210.rockpaperscissors to javafx.fxml;
    exports miracosta.cs210.rockpaperscissors;
}