package cz.mendelu.pef.pjj.xefanova.game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static cz.mendelu.pef.pjj.xefanova.game.Player.rollTheDice;

public class SkalaController {

    @FXML
    private ImageView kubik;

    @FXML
    private Label levelSkaly;

    @FXML
    private TextArea textWindow;

    @FXML
    private Label winLose;

    final int levelRock = rollTheDice();
    FileInputStream inputStream1 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 1.png");
    Image kubik1 = new Image(inputStream1);
    FileInputStream inputStream2 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 2.png");
    Image kubik2 = new Image(inputStream2);
    FileInputStream inputStream3 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 3.png");
    Image kubik3 = new Image(inputStream3);
    FileInputStream inputStream4 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 4.png");
    Image kubik4 = new Image(inputStream4);
    FileInputStream inputStream5 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 5.png");
    Image kubik5 = new Image(inputStream5);
    FileInputStream inputStream6 = new FileInputStream("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//kubik - 6.png");
    Image kubik6 = new Image(inputStream6);

    public SkalaController() throws FileNotFoundException {
    }

    public void initialize(){
        levelSkaly.setText("Rock Level: " + levelRock);
    }

    @FXML
    void rollDice(MouseEvent event) {
        int dicePlayer = rollTheDice();
        if(dicePlayer==1) {
            kubik.setImage(kubik1);
        }if(dicePlayer==2) {
            kubik.setImage(kubik2);
        }if(dicePlayer==3) {
            kubik.setImage(kubik3);
        }if(dicePlayer==4) {
            kubik.setImage(kubik4);
        }if(dicePlayer==5) {
            kubik.setImage(kubik5);
        }if(dicePlayer==6) {
            kubik.setImage(kubik6);
        }

        if (dicePlayer > levelRock) {
            winLose.setText("You win!");
        } else {
            winLose.setText("You lose!");
        }
    }

}
