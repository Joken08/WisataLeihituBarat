package com.example.wisataleihitubarat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class BatuDuaCafe extends AppCompatActivity {

    private CardView back, mapsbatuduacafe;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu_dua_cafe);

        back = findViewById(R.id.back);
        mapsbatuduacafe = findViewById(R.id.mapsbatuduacafe);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1552983059/a0qvmmqdbtsa7qooyern.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1552982824/fknhybwtynwau4bpywia.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1552982953/anq1vfhbzkdmavd2pgng.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1552982878/ta7glz1fuwv48ifbmmcz.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1552982914/lpyxgpenkmn1i4osb0su.jpg", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView mapsbatuduacafe = (CardView) findViewById(R.id.mapsbatuduacafe);
        mapsbatuduacafe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsBatuDuaCafe.class);
                startActivityForResult(myIntent, 0);
            }
        });



        }
}