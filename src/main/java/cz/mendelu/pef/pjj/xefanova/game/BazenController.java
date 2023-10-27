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

public class BazenController {

    @FXML
    private Label Swamp;

    @FXML
    private Label You;

    @FXML
    private ImageView kubikS;

    @FXML
    private ImageView kubikY;

    @FXML
    private TextArea textWindow;

    @FXML
    private Label winLose;

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

    private int diceSwamp = 0;

    public BazenController() throws FileNotFoundException {
    }

    @FXML
    void rollDiceS(MouseEvent event) {
      diceSwamp = rollTheDice();
        if(diceSwamp==1) {
            kubikS.setImage(kubik1);
        }if(diceSwamp==2) {
            kubikS.setImage(kubik2);
        }if(diceSwamp==3) {
            kubikS.setImage(kubik3);
        }if(diceSwamp==4) {
            kubikS.setImage(kubik4);
        }if(diceSwamp==5) {
            kubikS.setImage(kubik5);
        }if(diceSwamp==6) {
            kubikS.setImage(kubik6);
        }
            winLose.setText("Now roll your dice!");
    }

    @FXML
    void rollDiceY(MouseEvent event) {
        if (diceSwamp == 0) {
            winLose.setText("First click on the swamp dice!");
        } else {
            int dicePlayer = rollTheDice();
            if (dicePlayer == 1) {
                kubikY.setImage(kubik1);
            }
            if (dicePlayer == 2) {
                kubikY.setImage(kubik2);
            }
            if (dicePlayer == 3) {
                kubikY.setImage(kubik3);
            }
            if (dicePlayer == 4) {
                kubikY.setImage(kubik4);
            }
            if (dicePlayer == 5) {
                kubikY.setImage(kubik5);
            }
            if (dicePlayer == 6) {
                kubikY.setImage(kubik6);
            }

            if (dicePlayer > diceSwamp) {
                winLose.setText("You win!");
            } else {
                winLose.setText("You lose!");
            }
        }
    }

}

