package cz.mendelu.pef.pjj.xefanova.game;

import java.util.*;

import static cz.mendelu.pef.pjj.xefanova.game.TypLokace.randomTypLokace;


public class Mapa {
    private int counterSkal = 9;
    private int counterBazen = 9;
    private int counterCest = 10;
    private int counterPavouk = 2;
    private int counterOhen = 1;
    private int counterBlueKrystal = 1;
    private int counterYellowKrystal = 1;
    private int counterRedKrystal = 1;
    private int counterCards = 34;
    static Player player1 = new Player("Player-1", 0,3);
    static Player player2 = new Player("Player-2", 5,2);
    static Player actualPlayer = player1;

    List<String> idCards = new ArrayList<>();
    static Map<String, TypLokace> mapGame = new HashMap<>();
    static Player[][] playersMap = new Player[6][6];

    public void initializateCards() {
        for (int i = 0; i < counterCards; i++) {
            idCards.add("closeCard" + i);
        }
    }

    public void initializatePlayersMap() {
        playersMap[player1.getPositionX()][player1.getPositionY()] = player1;
        playersMap[player2.getPositionX()][player2.getPositionY()] = player2;
    }

    public static void setActualPlayer(Player actualPlayer) {
        Mapa.actualPlayer = actualPlayer;
    }

    public void inicializateMap(){
        for (int i = 0; i < counterCest; i++) {
            TypLokace cestaObject = TypLokace.CESTA;
            String str = randomIdCard();
            mapGame.put(str, cestaObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterSkal; i++) {
            TypLokace skalaObject = TypLokace.SKALA;
            String str = randomIdCard();
            mapGame.put(str, skalaObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterBazen; i++) {
            TypLokace bazenObject = TypLokace.BAZEN;
            String str = randomIdCard();
            mapGame.put(str, bazenObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterPavouk; i++) {
            TypLokace spiderObject = TypLokace.SPIDER;
            String str = randomIdCard();
            mapGame.put(str, spiderObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterOhen; i++) {
            TypLokace fireObject = TypLokace.FIRE;
            String str = randomIdCard();
            mapGame.put(str, fireObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterYellowKrystal; i++) {
            TypLokace yellowDiamondObject = TypLokace.YELLOW_DIAMOND;
            String str = randomIdCard();
            mapGame.put(str, yellowDiamondObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterBlueKrystal; i++) {
            TypLokace blueDiamondObject = TypLokace.BLUE_DIAMOND;
            String str = randomIdCard();
            mapGame.put(str, blueDiamondObject);
            idCards.remove(str);
        }
        for (int i = 0; i < counterRedKrystal; i++) {
            TypLokace redDiamondObject = TypLokace.RED_DIAMOND;
            String str = randomIdCard();
            mapGame.put(str, redDiamondObject);
            idCards.remove(str);
        }
    }


    static void changeActualPlayer(){
        if (actualPlayer == player1){
            setActualPlayer(player2);
        } else {
            setActualPlayer(player1);
        }
    }

    static String getActualPozition(Player namePlayer){
        for (int i = 0; i < playersMap.length; i++) {
            for (int j = 0; j < playersMap[i].length; j++) {
                if (namePlayer == playersMap[i][j]){
                    return "(" + i + ", " + j + ")";
                }
            }
        }
        return null;
    }

    public String randomIdCard(){
        Random rand = new Random();
        String randomElement = null;
        for (int i = 0; i < 1; i++) {
            int randomIndex = rand.nextInt(idCards.size());
            randomElement = idCards.get(randomIndex);
        }
        return randomElement;
    }

    public static void main(String[] args) {
        Mapa map = new Mapa();
        map.initializateCards();
        map.inicializateMap();
        map.initializatePlayersMap();
        System.out.println(mapGame.size());
        System.out.println(actualPlayer);

        System.out.println(mapGame.get("closeCard1"));
        System.out.println(getActualPozition(player1));
        String pozicePlayer1 = "(" + (player1.getPositionX() + 1) + ", " + player1.getPositionY() + ")";
        System.out.println(pozicePlayer1);
        System.out.println(randomTypLokace());



    }

}
