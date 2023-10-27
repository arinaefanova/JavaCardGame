module cz.mendelu.pef.pjj.xefanova.game.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.mendelu.pef.pjj.xefanova.game to javafx.fxml;
    exports cz.mendelu.pef.pjj.xefanova.game;
}