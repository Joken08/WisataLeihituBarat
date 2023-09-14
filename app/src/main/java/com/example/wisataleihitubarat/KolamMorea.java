package com.example.wisataleihitubarat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class KolamMorea extends AppCompatActivity {

    private CardView back, mapskolammorea;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_morea);

        back = findViewById(R.id.back);
        mapskolammorea = findViewById(R.id.mapskolammorea);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://dailyvoyagers.com/wp-content/uploads/2017/05/2-3.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://dailyvoyagers.com/wp-content/uploads/2017/05/2-2.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://dailyvoyagers.com/wp-content/uploads/2017/05/3-3.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://dailyvoyagers.com/wp-content/uploads/2017/05/6-2.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://dailyvoyagers.com/wp-content/uploads/2017/05/7-2.jpg", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView kolammorea = (CardView) findViewById(R.id.mapskolammorea);
        kolammorea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsKolamMorea.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}