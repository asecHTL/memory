package at.htlgkr.memoryaplication;

import static at.htlgkr.memoryaplication.Logic.fillGameField;

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

import at.htlgkr.memoryaplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvTitle;
    Integer[][]gameField;
    Modell modell;
    List<Integer>imageViewList = new ArrayList<>();
    Logic logic;

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
        binding.tvTitle.setText("Test");

        gameField = Logic.fillGameField(imageViewList,gameField);

        //Blanke Felder anzeigen && Pictures in Liste einfügen
        addBlankFieldsToField();
        addPicturesToList();

        fillGameField(imageViewList,gameField);

        //Neues Modell mit dem Gamefield anlegen
        modell = new Modell(gameField);

        binding.imageView1.setOnClickListener(view->{

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

    public void addPicturesToList(){
        //Image Liste befüllen:
        imageViewList.add(R.drawable.picture1);imageViewList.add(R.drawable.picture1);
        imageViewList.add(R.drawable.picture2);imageViewList.add(R.drawable.picture2);
        imageViewList.add(R.drawable.picture3);imageViewList.add(R.drawable.picture3);
        imageViewList.add(R.drawable.picture4);imageViewList.add(R.drawable.picture4);
        imageViewList.add(R.drawable.picture4);imageViewList.add(R.drawable.picture5);
        imageViewList.add(R.drawable.picture5);imageViewList.add(R.drawable.picture6);
        imageViewList.add(R.drawable.picture6);imageViewList.add(R.drawable.picture7);
        imageViewList.add(R.drawable.picture7);imageViewList.add(R.drawable.picture8);
    }


    public void showPictures(Integer[][]pictureList){

    }
}