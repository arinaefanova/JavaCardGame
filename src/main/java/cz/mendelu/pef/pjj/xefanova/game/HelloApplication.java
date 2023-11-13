package cz.mendelu.pef.pjj.xefanova.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        Image favicon = new Image(Objects.requireNonNull(
                getClass().getResourceAsStream("/cz/mendelu/pef/pjj/xefanova/game/pictures/blueDiamond.png")));
        stage.getIcons().add(favicon);
        stage.setTitle("Diamond forest");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Mapa currentGame = new Mapa();
        currentGame.initializateCards();
        currentGame.inicializateMap();
        currentGame.initializatePlayersMap();
        launch();
    }
}