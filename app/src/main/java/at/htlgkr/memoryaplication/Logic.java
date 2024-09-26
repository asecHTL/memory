package at.htlgkr.memoryaplication;

import android.media.Image;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;

public class Logic {


    public double getRandomXY(int maximum, int minimum){
        Random rn = new Random();
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        int randomNum =  minimum + i;
        return randomNum;
    }

    public ImageView[][] setPicture(int x, int y, ImageView[][] gameField, ImageView imageView){
        gameField[x][y] = imageView;
        return gameField;
    }

    public boolean samePicture(int x, int y, int x2, int y2, ImageView[][] imageViews){
        ImageView first = imageViews[x][y];
        ImageView second = imageViews[x2][y2];

        if (first.equals(second)){
            return true;
        }
        return false;
    }

    public static Integer[][] fillGameField(List<Integer> imageList, Integer[][]gameField){
        for (int i = 0; i  < imageList.size(); i ++){
            gameField[i][i] = imageList.get(i);
        }
        return gameField;
    }




}
