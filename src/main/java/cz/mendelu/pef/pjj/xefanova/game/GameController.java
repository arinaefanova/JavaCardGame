package cz.mendelu.pef.pjj.xefanova.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static cz.mendelu.pef.pjj.xefanova.game.Mapa.*;
import static cz.mendelu.pef.pjj.xefanova.game.Player.Move;
import static cz.mendelu.pef.pjj.xefanova.game.Player.canMove;
import static cz.mendelu.pef.pjj.xefanova.game.TypLokace.*;

public class GameController  {
    @FXML
    private ImageView bDPlayer1;

    @FXML
    private ImageView bDPlayer2;

    @FXML
    private ImageView closeCard0;

    @FXML
    private ImageView closeCard1;

    @FXML
    private ImageView closeCard10;

    @FXML
    private ImageView closeCard11;

    @FXML
    private ImageView closeCard12;

    @FXML
    private ImageView closeCard13;

    @FXML
    private ImageView closeCard14;

    @FXML
    private ImageView closeCard15;

    @FXML
    private ImageView closeCard16;

    @FXML
    private ImageView closeCard17;

    @FXML
    private ImageView closeCard18;

    @FXML
    private ImageView closeCard19;

    @FXML
    private ImageView closeCard2;

    @FXML
    private ImageView closeCard20;

    @FXML
    private ImageView closeCard21;

    @FXML
    private ImageView closeCard22;

    @FXML
    private ImageView closeCard23;

    @FXML
    private ImageView closeCard24;

    @FXML
    private ImageView closeCard25;

    @FXML
    private ImageView closeCard26;

    @FXML
    private ImageView closeCard27;

    @FXML
    private ImageView closeCard28;

    @FXML
    private ImageView closeCard29;

    @FXML
    private ImageView closeCard3;

    @FXML
    private ImageView closeCard30;

    @FXML
    private ImageView closeCard31;

    @FXML
    private ImageView closeCard32;

    @FXML
    private ImageView closeCard33;

    @FXML
    private ImageView closeCard4;

    @FXML
    private ImageView closeCard5;

    @FXML
    private ImageView closeCard6;

    @FXML
    private ImageView closeCard7;

    @FXML
    private ImageView closeCard8;

    @FXML
    private ImageView closeCard9;

    @FXML
    private ImageView rDPlayer1;

    @FXML
    private ImageView rDPlayer2;

    @FXML
    private ImageView start1;

    @FXML
    private ImageView start2;

    @FXML
    private TextArea textMessage;

    @FXML
    private ImageView yDPlayer1;

    @FXML
    private ImageView yDPlayer2;

    @FXML
    private Label moveActualPlayer;

    public GameController() throws FileNotFoundException {
    }

    TypLokace skala1 = SKALA;
    FileInputStream inputStream = new FileInputStream(skala1.getAdresaImage());
    Image skala = new Image(inputStream);
    TypLokace ohen1 = FIRE;
    FileInputStream inputStream5 = new FileInputStream(ohen1.getAdresaImage());
    Image ohen = new Image(inputStream5);
    TypLokace cesta1 = CESTA;
    FileInputStream inputStream6 = new FileInputStream(cesta1.getAdresaImage());
    Image cesta = new Image(inputStream6);
    TypLokace bazen1 = BAZEN;
    FileInputStream inputStream7 = new FileInputStream(bazen1.getAdresaImage());
    Image bazen = new Image(inputStream7);
    TypLokace spider1 = SPIDER;
    FileInputStream inputStream8 = new FileInputStream(spider1.getAdresaImage());
    Image spider = new Image(inputStream8);
    TypLokace redDiamond1 = RED_DIAMOND;
    FileInputStream inputStream9 = new FileInputStream(redDiamond1.getAdresaImage());
    Image redDiamond = new Image(inputStream9);
    TypLokace yellowDiamond1 = YELLOW_DIAMOND;
    FileInputStream inputStream10 = new FileInputStream(yellowDiamond1.getAdresaImage());
    Image yellowDiamond = new Image(inputStream10);
    TypLokace blueDiamond1 = BLUE_DIAMOND;
    FileInputStream inputStream11 = new FileInputStream(blueDiamond1.getAdresaImage());
    Image blueDiamond = new Image(inputStream11);

    String basePath = "src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/";

    FileInputStream inputStream1 = new FileInputStream(basePath + "3.png");
    Image blueCard = new Image(inputStream1);

    FileInputStream inputStream2 = new FileInputStream(basePath + "redDiamond.png");
    Image redDiamondInv = new Image(inputStream2);

    FileInputStream inputStream3 = new FileInputStream(basePath + "yellowDiamond.png");
    Image yellowDiamondInv = new Image(inputStream3);

    FileInputStream inputStream4 = new FileInputStream(basePath + "blueDiamond.png");
    Image blueDiamondInv = new Image(inputStream4);

    @FXML
    void initialize() {
        moveActualPlayer.setText(actualPlayer.getName());
        closeCard0.setImage(blueCard);closeCard1.setImage(blueCard);closeCard2.setImage(blueCard);closeCard3.setImage(blueCard);
        closeCard4.setImage(blueCard);closeCard5.setImage(blueCard);closeCard6.setImage(blueCard);closeCard7.setImage(blueCard);
        closeCard8.setImage(blueCard);closeCard9.setImage(blueCard);closeCard10.setImage(blueCard);closeCard11.setImage(blueCard);
        closeCard12.setImage(blueCard);closeCard13.setImage(blueCard);closeCard14.setImage(blueCard);closeCard15.setImage(blueCard);
        closeCard16.setImage(blueCard);closeCard17.setImage(blueCard);closeCard18.setImage(blueCard);closeCard19.setImage(blueCard);
        closeCard20.setImage(blueCard);closeCard21.setImage(blueCard);closeCard22.setImage(blueCard);closeCard23.setImage(blueCard);
        closeCard24.setImage(blueCard);closeCard25.setImage(blueCard);closeCard26.setImage(blueCard);closeCard27.setImage(blueCard);
        closeCard28.setImage(blueCard);closeCard29.setImage(blueCard);closeCard30.setImage(blueCard);closeCard31.setImage(blueCard);
        closeCard32.setImage(blueCard);closeCard33.setImage(blueCard);
    }

    void zmenaObrazku(ImageView jmeno, String nazev) throws IOException {
        String imageLokace = String.valueOf(mapGame.get(nazev));
        if (actualPlayer.diamonds.size() == 3){
            Parent root = FXMLLoader.load(getClass().getResource("/cz/mendelu/pef/pjj/xefanova/game/end-view.fxml"));
            Stage end = new Stage();
            end.setScene(new Scene(root));
            end.initModality(Modality.APPLICATION_MODAL);
            end.showAndWait();
            end.setResizable(false);
        } else if (imageLokace.equals("SKALA")) {
            jmeno.setImage(skala);
            Parent root = FXMLLoader.load(getClass().getResource("/cz/mendelu/pef/pjj/xefanova/game/skala-view.fxml"));
            Stage skala = new Stage();
            skala.setScene(new Scene(root));
            skala.initModality(Modality.APPLICATION_MODAL);
            skala.setResizable(false);
            skala.showAndWait();
        } else if (imageLokace.equals("FIRE")){
            jmeno.setImage(ohen);
            actualPlayer.diamonds.remove(BLUE_DIAMOND);
            actualPlayer.diamonds.remove(RED_DIAMOND);
            actualPlayer.diamonds.remove(YELLOW_DIAMOND);
            if (actualPlayer == player1){
                rDPlayer1.setImage(null);
                yDPlayer1.setImage(null);
                bDPlayer1.setImage(null);
            } else {
                rDPlayer2.setImage(null);
                yDPlayer2.setImage(null);
                bDPlayer2.setImage(null);
            }
            textMessage.setText(actualPlayer.getName() + " - You're out of luck! You lost all the diamonds in the fire. Try again.");
        }else if (imageLokace.equals("CESTA")){
            jmeno.setImage(cesta);
            textMessage.setText(actualPlayer.getName() + " - You turned over the road card. Just go to this field!");
        } else if (imageLokace.equals("BAZEN")){
            jmeno.setImage(bazen);
            Parent root = FXMLLoader.load(getClass().getResource("/cz/mendelu/pef/pjj/xefanova/game/bazen-view.fxml"));
            Stage bazen = new Stage();
            bazen.setScene(new Scene(root));
            bazen.initModality(Modality.APPLICATION_MODAL);
            bazen.setResizable(false);
            bazen.showAndWait();
        } else if (imageLokace.equals("RED_DIAMOND")){
            jmeno.setImage(redDiamond);
            actualPlayer.addRedDiamond();
            textMessage.setText(actualPlayer.getName() + " - You got the red diamond!");
            if (actualPlayer == player1){
                rDPlayer1.setImage(redDiamondInv);
            } else {
                rDPlayer2.setImage(redDiamondInv);
            }
        } else if (imageLokace.equals("YELLOW_DIAMOND")){
            jmeno.setImage(yellowDiamond);
            actualPlayer.addYellowDiamond();
            textMessage.setText(actualPlayer.getName() + " - You got the yellow diamond!");
            if (actualPlayer == player1){
                yDPlayer1.setImage(yellowDiamondInv);
            } else {
                yDPlayer2.setImage(yellowDiamondInv);
            }
        }else if (imageLokace.equals("BLUE_DIAMOND")){
            jmeno.setImage(blueDiamond);
            actualPlayer.addBlueDiamond();
            textMessage.setText(actualPlayer.getName() + " - You got the blue diamond!");
            if (actualPlayer == player1){
                bDPlayer1.setImage(blueDiamondInv);
            } else {
                bDPlayer2.setImage(blueDiamondInv);
            }
        } else if (imageLokace.equals("SPIDER")){
            jmeno.setImage(spider);
            Object lostDiamond = randomTypLokace();
            actualPlayer.diamonds.remove(lostDiamond);
            textMessage.setText(actualPlayer.getName() + " - Spider tried to steal your diamond:" + lostDiamond + ". If you didn't have it, you're in luck!");
            if (lostDiamond.equals("RED_DIAMOND")){
                if (actualPlayer == player1){
                    rDPlayer1.setImage(null);
                } else {
                    rDPlayer2.setImage(null);
                }
            } else if (lostDiamond.equals("YELLOW_DIAMOND")){
                if (actualPlayer == player1){
                    yDPlayer1.setImage(null);
                } else {
                    yDPlayer2.setImage(null);
                }
            }else if (lostDiamond.equals("BLUE_DIAMOND")){
                if (actualPlayer == player1){
                    bDPlayer1.setImage(null);
                } else {
                    bDPlayer2.setImage(null);
                }
        }
    }}


    @FXML
    void clickCard0(MouseEvent event) throws IOException {
        int xCard0 = 0;
        int yCard0 = 0;
        String poziceCard0 = "(" + xCard0 + ", " + yCard0 + ")";
        if (canMove(poziceCard0, actualPlayer)){
        String nazev = event.getPickResult().getIntersectedNode().getId();
        if (closeCard0.getImage() == blueCard){
            textMessage.setText(actualPlayer.getName() + " - You flip card!");
            zmenaObrazku(closeCard0, nazev);
            Move(actualPlayer, xCard0,yCard0);
            changeActualPlayer();
            moveActualPlayer.setText(actualPlayer.getName());
        } else {
            closeCard0.setImage(blueCard);
        }
    } else {
        textMessage.setText(actualPlayer.getName() + " - You can not move here!");
    }}

    @FXML
    void clickCard1(MouseEvent event) throws IOException {
        int xCard1 = 1;
        int yCard1 = 0;
        String poziceCard1 = "(" + xCard1 + ", " + yCard1 + ")";
        if (canMove(poziceCard1, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard1.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard1, nazev);
                Move(actualPlayer, xCard1,yCard1);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard1.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard2(MouseEvent event) throws IOException {
        int xCard2 = 2;
        int yCard2 = 0;
        String poziceCard2 = "(" + xCard2 + ", " + yCard2 + ")";
        if (canMove(poziceCard2, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard2.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard2, nazev);
                Move(actualPlayer, xCard2,yCard2);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard2.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard3(MouseEvent event) throws IOException {
        int xCard3 = 3;
        int yCard3 = 0;
        String poziceCard3 = "(" + xCard3 + ", " + yCard3 + ")";
        if (canMove(poziceCard3, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard3.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard3, nazev);
                Move(actualPlayer, xCard3,yCard3);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard3.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard4(MouseEvent event) throws IOException {
        int xCard4 = 4;
        int yCard4 = 0;
        String poziceCard4 = "(" + xCard4 + ", " + yCard4 + ")";
        if (canMove(poziceCard4, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard4.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard4, nazev);
                Move(actualPlayer, xCard4,yCard4);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard4.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard5(MouseEvent event) throws IOException {
        int xCard5 = 5;
        int yCard5 = 0;
        String poziceCard5 = "(" + xCard5 + ", " + yCard5 + ")";
        if (canMove(poziceCard5, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard5.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard5, nazev);
                Move(actualPlayer, xCard5,yCard5);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard5.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard6(MouseEvent event) throws IOException {
        int xCard6 = 0;
        int yCard6 = 1;
        String poziceCard6 = "(" + xCard6 + ", " + yCard6 + ")";
        if (canMove(poziceCard6, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard6.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard6, nazev);
                Move(actualPlayer, xCard6,yCard6);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard6.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard7(MouseEvent event) throws IOException {
        int xCard7 = 1;
        int yCard7 = 1;
        String poziceCard7 = "(" + xCard7 + ", " + yCard7 + ")";
        if (canMove(poziceCard7, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard7.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard7, nazev);
                Move(actualPlayer, xCard7,yCard7);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard7.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard8(MouseEvent event) throws IOException {
        int xCard8 = 2;
        int yCard8 = 1;
        String poziceCard8 = "(" + xCard8 + ", " + yCard8 + ")";
        if (canMove(poziceCard8, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard8.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard8, nazev);
                Move(actualPlayer, xCard8,yCard8);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard8.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard9(MouseEvent event) throws IOException {
        int xCard9 = 3;
        int yCard9 = 1;
        String poziceCard9 = "(" + xCard9 + ", " + yCard9 + ")";
        if (canMove(poziceCard9, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard9.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard9, nazev);
                Move(actualPlayer, xCard9,yCard9);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard9.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard10(MouseEvent event) throws IOException {
        int xCard10 = 4;
        int yCard10 = 1;
        String poziceCard10 = "(" + xCard10 + ", " + yCard10 + ")";
        if (canMove(poziceCard10, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard10.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard10, nazev);
                Move(actualPlayer, xCard10,yCard10);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard10.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard11(MouseEvent event) throws IOException {
        int xCard11 = 5;
        int yCard11 = 1;
        String poziceCard11 = "(" + xCard11 + ", " + yCard11 + ")";
        if (canMove(poziceCard11, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard11.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard11, nazev);
                Move(actualPlayer, xCard11,yCard11);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard11.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard12(MouseEvent event) throws IOException {
        int xCard12 = 0;
        int yCard12 = 2;
        String poziceCard12 = "(" + xCard12 + ", " + yCard12 + ")";
        if (canMove(poziceCard12, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard12.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard12, nazev);
                Move(actualPlayer, xCard12,yCard12);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard12.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard13(MouseEvent event) throws IOException {
        int xCard13 = 1;
        int yCard13 = 2;
        String poziceCard13 = "(" + xCard13 + ", " + yCard13 + ")";
        if (canMove(poziceCard13, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard13.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard13, nazev);
                Move(actualPlayer, xCard13,yCard13);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard13.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard14(MouseEvent event) throws IOException {
        int xCard14 = 2;
        int yCard14 = 2;
        String poziceCard14 = "(" + xCard14 + ", " + yCard14 + ")";
        if (canMove(poziceCard14, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard14.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard14, nazev);
                Move(actualPlayer, xCard14,yCard14);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard14.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard15(MouseEvent event) throws IOException {
        int xCard15 = 3;
        int yCard15 = 2;
        String poziceCard15 = "(" + xCard15 + ", " + yCard15 + ")";
        if (canMove(poziceCard15, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard15.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard15, nazev);
                Move(actualPlayer, xCard15,yCard15);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard15.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard16(MouseEvent event) throws IOException {
        int xCard16 = 4;
        int yCard16 = 2;
        String poziceCard16 = "(" + xCard16 + ", " + yCard16 + ")";
        if (canMove(poziceCard16, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard16.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard16, nazev);
                Move(actualPlayer, xCard16,yCard16);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard16.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard17(MouseEvent event) throws IOException {
        int xCard17 = 1;
        int yCard17 = 3;
        String poziceCard17 = "(" + xCard17 + ", " + yCard17 + ")";
        if (canMove(poziceCard17, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard17.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard17, nazev);
                Move(actualPlayer, xCard17,yCard17);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard17.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard18(MouseEvent event) throws IOException {
        int xCard18 = 2;
        int yCard18 = 3;
        String poziceCard18 = "(" + xCard18 + ", " + yCard18 + ")";
        if (canMove(poziceCard18, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard18.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard18, nazev);
                Move(actualPlayer, xCard18,yCard18);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard18.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard19(MouseEvent event) throws IOException {
        int xCard19 = 3;
        int yCard19 = 3;
        String poziceCard19 = "(" + xCard19 + ", " + yCard19 + ")";
        if (canMove(poziceCard19, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard19.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard19, nazev);
                Move(actualPlayer, xCard19,yCard19);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard19.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard20(MouseEvent event) throws IOException {
        int xCard20 = 4;
        int yCard20 = 3;
        String poziceCard20 = "(" + xCard20 + ", " + yCard20 + ")";
        if (canMove(poziceCard20, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard20.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard20, nazev);
                Move(actualPlayer, xCard20,yCard20);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard20.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard21(MouseEvent event) throws IOException {
        int xCard21 = 5;
        int yCard21 = 3;
        String poziceCard21 = "(" + xCard21 + ", " + yCard21 + ")";
        if (canMove(poziceCard21, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard21.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard21, nazev);
                Move(actualPlayer, xCard21,yCard21);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard21.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard22(MouseEvent event) throws IOException {
        int xCard22 = 0;
        int yCard22 = 4;
        String poziceCard22 = "(" + xCard22 + ", " + yCard22 + ")";
        if (canMove(poziceCard22, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard22.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard22, nazev);
                Move(actualPlayer, xCard22,yCard22);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard22.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard23(MouseEvent event) throws IOException {
        int xCard23 = 1;
        int yCard23 = 4;
        String poziceCard23 = "(" + xCard23 + ", " + yCard23 + ")";
        if (canMove(poziceCard23, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard23.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard23, nazev);
                Move(actualPlayer, xCard23,yCard23);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard23.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard24(MouseEvent event) throws IOException {
        int xCard24 = 2;
        int yCard24 = 4;
        String poziceCard24 = "(" + xCard24 + ", " + yCard24 + ")";
        if (canMove(poziceCard24, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard24.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard24, nazev);
                Move(actualPlayer, xCard24,yCard24);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard24.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard25(MouseEvent event) throws IOException {
        int xCard25 = 3;
        int yCard25 = 4;
        String poziceCard25 = "(" + xCard25 + ", " + yCard25 + ")";
        if (canMove(poziceCard25, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard25.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard25, nazev);
                Move(actualPlayer, xCard25,yCard25);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard25.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard26(MouseEvent event) throws IOException {
        int xCard26 = 4;
        int yCard26 = 4;
        String poziceCard26 = "(" + xCard26 + ", " + yCard26 + ")";
        if (canMove(poziceCard26, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard26.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard26, nazev);
                Move(actualPlayer, xCard26,yCard26);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard26.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard27(MouseEvent event) throws IOException {
        int xCard27 = 5;
        int yCard27 = 4;
        String poziceCard27 = "(" + xCard27 + ", " + yCard27 + ")";
        if (canMove(poziceCard27, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard27.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard27, nazev);
                Move(actualPlayer, xCard27,yCard27);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard27.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard28(MouseEvent event) throws IOException {
        int xCard28 = 0;
        int yCard28 = 5;
        String poziceCard28 = "(" + xCard28 + ", " + yCard28 + ")";
        if (canMove(poziceCard28, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard28.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard28, nazev);
                Move(actualPlayer, xCard28,yCard28);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard28.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard29(MouseEvent event) throws IOException {
        int xCard29 = 1;
        int yCard29 = 5;
        String poziceCard29 = "(" + xCard29 + ", " + yCard29 + ")";
        if (canMove(poziceCard29, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard29.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard29, nazev);
                Move(actualPlayer, xCard29,yCard29);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard29.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard30(MouseEvent event) throws IOException {
        int xCard30 = 2;
        int yCard30 = 5;
        String poziceCard30 = "(" + xCard30 + ", " + yCard30 + ")";
        if (canMove(poziceCard30, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard30.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard30, nazev);
                Move(actualPlayer, xCard30,yCard30);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard30.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard31(MouseEvent event) throws IOException {
        int xCard31 = 3;
        int yCard31 = 5;
        String poziceCard31 = "(" + xCard31 + ", " + yCard31 + ")";
        if (canMove(poziceCard31, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard31.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard31, nazev);
                Move(actualPlayer, xCard31,yCard31);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard31.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard32(MouseEvent event) throws IOException {
        int xCard32 = 4;
        int yCard32 = 5;
        String poziceCard32 = "(" + xCard32 + ", " + yCard32 + ")";
        if (canMove(poziceCard32, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard32.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard32, nazev);
                Move(actualPlayer, xCard32,yCard32);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard32.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}
    @FXML
    void clickCard33(MouseEvent event) throws IOException {
        int xCard33 = 5;
        int yCard33 = 5;
        String poziceCard33 = "(" + xCard33 + ", " + yCard33 + ")";
        if (canMove(poziceCard33, actualPlayer)){
            String nazev = event.getPickResult().getIntersectedNode().getId();
            if (closeCard33.getImage() == blueCard){
                textMessage.setText(actualPlayer.getName() + " - You flip card!");
                zmenaObrazku(closeCard33, nazev);
                Move(actualPlayer, xCard33,yCard33);
                changeActualPlayer();
                moveActualPlayer.setText(actualPlayer.getName());
            } else {
                closeCard33.setImage(blueCard);
            }
        } else {
            textMessage.setText(actualPlayer.getName() + " - You can not move here!");
        }}


}

