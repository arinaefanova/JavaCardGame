package cz.mendelu.pef.pjj.xefanova.game;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController  {

    @FXML
    private Button startGameButton;

    @FXML
    void initialize() {
        startGameButton.setOnAction(event -> {
            try {
                handle(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void handle(ActionEvent event) throws IOException {
        startGameButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/cz/mendelu/pef/pjj/xefanova/game/game-view.fxml"));
        loader.load();

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.showAndWait();

    }
}



