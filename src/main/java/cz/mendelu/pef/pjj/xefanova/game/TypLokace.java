package cz.mendelu.pef.pjj.xefanova.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum TypLokace {
    SKALA("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//skala.png"),
    BAZEN("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//bazen.png"),
    CESTA("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//cesta.png"),
    RED_DIAMOND("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//redKrystal.png"),
    YELLOW_DIAMOND("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//yellowKrystal.png"),
    BLUE_DIAMOND("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//blueKrystal.png"),
    FIRE("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//ohen.png"),
    SPIDER("C://Users//Arina//Desktop//Game//src//main//resources//cz//mendelu//pef//pjj//xefanova//game//pictures//pavouk.png");

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





