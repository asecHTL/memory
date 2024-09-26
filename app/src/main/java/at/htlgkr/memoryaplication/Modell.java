package at.htlgkr.memoryaplication;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Modell {
    private Integer[][]gameField;

    public Modell(Integer[][] gameField) {
        this.gameField = gameField;
    }

    public Integer[][] getGameField() {
        return gameField;
    }

    public void setGameField(Integer[][] gameField) {
        this.gameField = gameField;
    }






}
