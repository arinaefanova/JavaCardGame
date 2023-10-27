package cz.mendelu.pef.pjj.xefanova.game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static cz.mendelu.pef.pjj.xefanova.game.Mapa.actualPlayer;

public class EndController {

    @FXML
    private Label endGame;

    public void initialize() {
        endGame.setText(actualPlayer.getName() + " is winner!");
    }
}