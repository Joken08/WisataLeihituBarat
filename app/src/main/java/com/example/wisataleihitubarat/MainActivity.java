package com.example.wisataleihitubarat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.hatu, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.liliboi, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.allang, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.wakasihu, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.larike, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        ImageView etika = findViewById(R.id.etika);
        ImageView wisata = findViewById(R.id.wisata);
        ImageView panduan = findViewById(R.id.panduan);

        etika.setOnClickListener((view) -> {
            Intent imageView2 = new Intent(MainActivity.this, Etika.class);
            startActivity(imageView2);
        });

        wisata.setOnClickListener((view) -> {
            Intent imageView4 = new Intent(MainActivity.this, Wisata.class);
            startActivity(imageView4);
        });

        panduan.setOnClickListener((view) -> {
            Intent imageView5 = new Intent(MainActivity.this, Panduan.class);
            startActivity(imageView5);
        });




    }

}