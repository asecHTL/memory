package at.htlgkr.memoryaplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Logic {

    public List<Integer> fillPicturesSorted(){
        List<Integer>picturesSorted = new ArrayList<>();
        //Image Liste befüllen:
        picturesSorted.add(R.drawable.picture1);
        picturesSorted.add(R.drawable.picture2);
        picturesSorted.add(R.drawable.picture3);
        picturesSorted.add(R.drawable.picture4);
        picturesSorted.add(R.drawable.picture5);
        picturesSorted.add(R.drawable.picture6);
        picturesSorted.add(R.drawable.picture7);
        picturesSorted.add(R.drawable.picture8);
        return picturesSorted;
    }

    public List<Integer> allPicturesInList(){
        List<Integer>pictures = new ArrayList<>();
        pictures.add(R.drawable.picture1);pictures.add(R.drawable.picture1);
        pictures.add(R.drawable.picture2);pictures.add(R.drawable.picture2);
        pictures.add(R.drawable.picture3);pictures.add(R.drawable.picture3);
        pictures.add(R.drawable.picture4);pictures.add(R.drawable.picture4);
        pictures.add(R.drawable.picture5);pictures.add(R.drawable.picture5);
        pictures.add(R.drawable.picture6);pictures.add(R.drawable.picture6);
        pictures.add(R.drawable.picture7);pictures.add(R.drawable.picture7);
        pictures.add(R.drawable.picture8);pictures.add(R.drawable.picture8);
        return pictures;
    }

    public List<Integer> fillPicturesRandom(List<Integer>picturesRandom){
        Collections.shuffle(picturesRandom);
        return picturesRandom;
    }


}
