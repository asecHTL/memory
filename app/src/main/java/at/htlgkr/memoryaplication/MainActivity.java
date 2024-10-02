package at.htlgkr.memoryaplication;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import at.htlgkr.memoryaplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvTitle;
    TextView pairCounter;
    int counter = 0;
    String pairCounterString = "0";

    List<Integer>picturesSorted = new ArrayList<>();
    List<Integer>picturesRandom = new ArrayList<>();
    List<Integer>forGameFieldPictues = new ArrayList<>();
    List<Integer>picturesOncklick = new ArrayList<>();
    Logic logic = new Logic();


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText("Let's play some Memory");
        pairCounter = findViewById(R.id.pairCounter);
        pairCounterString = String.valueOf(counter);
        pairCounter.setText(pairCounterString);
        addBlankFieldsToField();
        //Sortiertes Array befüllen
        picturesSorted =  logic.fillPicturesSorted();
        //Alle Gesamten Pictures in einem Array befüllen
        forGameFieldPictues = logic.allPicturesInList();
        //Eine gemixte Liste von allen Pictures
        picturesRandom = logic.fillPicturesRandom(forGameFieldPictues);

        binding.imageView1.setOnClickListener(view->{
            binding.imageView1.setImageResource(picturesRandom.get(0));
            picturesOncklick.add(picturesRandom.get(0));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView2.setOnClickListener(view->{
            binding.imageView2.setImageResource(picturesRandom.get(1));
            picturesOncklick.add(picturesRandom.get(1));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView3.setOnClickListener(view->{
            binding.imageView3.setImageResource(picturesRandom.get(2));
            picturesOncklick.add(picturesRandom.get(2));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView4.setOnClickListener(view->{
            binding.imageView4.setImageResource(picturesRandom.get(3));
            picturesOncklick.add(picturesRandom.get(3));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView5.setOnClickListener(view->{
            binding.imageView5.setImageResource(picturesRandom.get(4));
            picturesOncklick.add(picturesRandom.get(4));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView6.setOnClickListener(view->{
            binding.imageView6.setImageResource(picturesRandom.get(5));
            picturesOncklick.add(picturesRandom.get(5));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView7.setOnClickListener(view->{
            binding.imageView7.setImageResource(picturesRandom.get(6));
            picturesOncklick.add(picturesRandom.get(6));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView8.setOnClickListener(view->{
            binding.imageView8.setImageResource(picturesRandom.get(7));
            picturesOncklick.add(picturesRandom.get(7));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView9.setOnClickListener(view->{
            binding.imageView9.setImageResource(picturesRandom.get(8));
            picturesOncklick.add(picturesRandom.get(8));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView10.setOnClickListener(view->{
            binding.imageView10.setImageResource(picturesRandom.get(9));
            picturesOncklick.add(picturesRandom.get(9));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView11.setOnClickListener(view->{
            binding.imageView11.setImageResource(picturesRandom.get(10));
            picturesOncklick.add(picturesRandom.get(10));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView12.setOnClickListener(view->{
            binding.imageView12.setImageResource(picturesRandom.get(11));
            picturesOncklick.add(picturesRandom.get(11));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView13.setOnClickListener(view->{
            binding.imageView13.setImageResource(picturesRandom.get(12));
            picturesOncklick.add(picturesRandom.get(12));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView14.setOnClickListener(view->{
            binding.imageView14.setImageResource(picturesRandom.get(13));
            picturesOncklick.add(picturesRandom.get(13));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView15.setOnClickListener(view->{
            binding.imageView15.setImageResource(picturesRandom.get(14));
            picturesOncklick.add(picturesRandom.get(14));
            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        binding.imageView16.setOnClickListener(view->{
            binding.imageView16.setImageResource(picturesRandom.get(15));
            picturesOncklick.add(picturesRandom.get(15));

            try {
                handle(picturesOncklick);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

    }


    @Override
    public void onClick(View v) {

        Snackbar.make(v,"Gewonnen",Snackbar.LENGTH_SHORT).show();
    }

    public void addBlankFieldsToField(){
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

    public void handle(List<Integer>picturesClicked ) throws InterruptedException {
        if (picturesClicked.size() == 2){
            if (Objects.equals(picturesClicked.get(0), picturesClicked.get(1))){
                tvTitle.setText("Toll du hast ein Paar gefunden");
                Thread.sleep(600);
                addBlankFieldsToField();
                pairCounterString = String.valueOf(counter);
                pairCounter.setText(pairCounterString);
                picturesClicked.clear();
                tvTitle.setText("Lets try again");

            }else {
                tvTitle.setText("Das war woll ein Griff ins kloo!");
                addBlankFieldsToField();
                tvTitle.setText("Lets try again");
                Thread.sleep(600);
            }
        }
    }









}