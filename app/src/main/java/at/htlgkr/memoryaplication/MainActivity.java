package at.htlgkr.memoryaplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import at.htlgkr.memoryaplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvTitle;

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

        binding.imageView1.setImageResource(R.drawable.picture00);
        binding.imageView1.setOnClickListener(view -> {
            binding.imageView1.setImageResource(R.drawable.ic_launcher_background);
        });


    }


    @Override
    public void onClick(View v) {
        Snackbar.make(v,"Gewonnen",Snackbar.LENGTH_SHORT).show();
    }
}