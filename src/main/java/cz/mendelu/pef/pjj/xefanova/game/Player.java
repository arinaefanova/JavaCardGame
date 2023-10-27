package cz.mendelu.pef.pjj.xefanova.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static cz.mendelu.pef.pjj.xefanova.game.Mapa.actualPlayer;
import static cz.mendelu.pef.pjj.xefanova.game.Mapa.playersMap;

public class Player {
    private String name;
    private int positionX;
    private int positionY;
    List<Object> diamonds = new ArrayList<>(3);

    public String getName() {
        return name;
    }

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * Metoda, ktera simuluje hod kostkou hrace
     * @return cislo na kostce
     */
     static int rollTheDice(){
        int shot = 0;
        Random randomGenerator = new Random();
        shot = randomGenerator.nextInt(6)+1;
        return shot;
    }

    public void addRedDiamond(){
         if (actualPlayer.diamonds.contains(TypLokace.RED_DIAMOND)){
         } else {
        diamonds.add(TypLokace.RED_DIAMOND);}
    }
    public void addBlueDiamond(){
        if (actualPlayer.diamonds.contains(TypLokace.BLUE_DIAMOND)){
        } else {
            diamonds.add(TypLokace.BLUE_DIAMOND);}
    }
    public void addYellowDiamond(){
        if (actualPlayer.diamonds.contains(TypLokace.YELLOW_DIAMOND)){
        } else {
            diamonds.add(TypLokace.YELLOW_DIAMOND);}
    }
    public Object getDiamonds(TypLokace diamond) {
        for (int i = 0; i < diamonds.size(); i++) {
            return diamonds.get(i) == diamond;
        }
        return null;
    }

    static boolean canMove(String poziceCard, Player player){
        String pozicePlayer1 = "(" + (player.getPositionX() + 1) + ", " + player.getPositionY() + ")";
        String pozicePlayer2 = "(" + (player.getPositionX() - 1) + ", " + player.getPositionY() + ")";
        String pozicePlayer3 = "(" + player.getPositionX() + ", " + (player.getPositionY() + 1) + ")";
        String pozicePlayer4 = "(" + player.getPositionX() + ", " + (player.getPositionY() - 1) + ")";
        if (poziceCard.equals(pozicePlayer1) || poziceCard.equals(pozicePlayer2)
        || poziceCard.equals(pozicePlayer3) || poziceCard.equals(pozicePlayer4)) {
            return true;
        }
        return false;
    }

    static void Move(Player player, int X, int Y){
        playersMap[player.getPositionX()][player.getPositionY()] = null;
        playersMap[X][Y] = player;
        player.setPositionX(X);
        player.setPositionY(Y);
    }


    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }


}
