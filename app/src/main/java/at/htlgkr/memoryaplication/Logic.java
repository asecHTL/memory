package at.htlgkr.memoryaplication;

import android.media.Image;
import android.os.Debug;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import at.htlgkr.memoryaplication.databinding.ActivityMainBinding;

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

    public void addBlankFieldsToField(ActivityMainBinding binding){

        binding.imageView1.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView2.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView3.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView4.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView5.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView6.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView7.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView8.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView9.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView10.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView11.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView12.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView13.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView14.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView15.setImageResource(R.drawable.ic_launcher_background);
        binding.imageView16.setImageResource(R.drawable.ic_launcher_background);



    }

    public void setPairImage(List<ImageView>imageList, List<Integer>imageIdList){
        for (int i= 0; i < imageList.size(); i ++){
            int id = imageIdList.get(i);
            ImageView imageView = imageList.get(i);
            imageView.setImageResource(id);
        }
    }


}
