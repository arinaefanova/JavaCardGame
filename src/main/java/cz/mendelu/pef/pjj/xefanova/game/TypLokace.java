package cz.mendelu.pef.pjj.xefanova.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum TypLokace {
    SKALA("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/skala.png"),
    BAZEN("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/bazen.png"),
    CESTA("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/cesta.png"),
    RED_DIAMOND("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/redKrystal.png"),
    YELLOW_DIAMOND("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/yellowKrystal.png"),
    BLUE_DIAMOND("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/blueKrystal.png"),
    FIRE("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/ohen.png"),
    SPIDER("src/main/resources/cz/mendelu/pef/pjj/xefanova/game/pictures/pavouk.png");

    TypLokace(String adresaImage) {
        this.adresaImage = adresaImage;
    }

    private String adresaImage;

    public String getAdresaImage() {
        return adresaImage;}

    static TypLokace randomTypLokace(){
        List<TypLokace> barvyKrystalu = new ArrayList<>();
        barvyKrystalu.add(TypLokace.RED_DIAMOND);
        barvyKrystalu.add(TypLokace.BLUE_DIAMOND);
        barvyKrystalu.add(TypLokace.YELLOW_DIAMOND);
        Random rand = new Random();
        TypLokace randomElement = null;
        for (int i = 0; i < 1; i++) {
            int randomIndex = rand.nextInt(barvyKrystalu.size());
            randomElement = barvyKrystalu.get(randomIndex);
        }
        return randomElement;
    }

}





