package at.htlgkr.memoryaplication;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Modell {
    private ImageView[][]gameField;

    public Modell(ImageView[][] gameField) {
        this.gameField = gameField;
    }

    public ImageView[][] getGameField() {
        return gameField;
    }

    public void setGameField(ImageView[][] gameField) {
        this.gameField = gameField;
    }



    public void createGamefield(ImageView[][] modell, List<ImageView> imageViewList){
        int xFull = 0;
        int yFull = 0;
        List<Integer>CordXTaken = new ArrayList<>();
        List<Integer>CordYTaken = new ArrayList<>();
        Random random = new Random();
        boolean doneX = false;
        boolean doneY = false;


        do {
            if (xFull == 8){

                doneX = true;
            }else{
                int n = 16 - 1 + 1;
                int i = random.nextInt() % n;
                int randomNum =  1 + i;
                if (CordXTaken.contains(randomNum)){
                    doneX = false;
                }else{
                    xFull++;
                }
            }

        }while (doneX != true);




        do {
            if (yFull == 8){
                doneY = true;
            }else{
                int n = 16 - 1 + 1;
                int i = random.nextInt() % n;
                int randomNum =  1 + i;
                if (CordYTaken.contains(randomNum)){
                    doneY = false;
                }else{
                    yFull++;
                }
            }

        }while (doneY != true);


    }
}
