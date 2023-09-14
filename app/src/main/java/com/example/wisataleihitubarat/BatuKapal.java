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

public class BatuKapal extends AppCompatActivity {

    private CardView back, mapsbatukapal;
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu_kapal);

        back = findViewById(R.id.back);
        mapsbatukapal = findViewById(R.id.mapsbatukapal);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://www.celebes.co/maluku/wp-content/uploads/2022/04/Fasilitas-di-Kawasan-Wisata-2.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1551838356/ihpbvp7todxkhawosapf.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1551838795/rx32crmgo5oova3amyf7.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.celebes.co/maluku/wp-content/uploads/2022/04/Daya-Tarik-di-Wisata-Batu-Kapal-Liliboi.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.celebes.co/maluku/wp-content/uploads/2022/04/Lokasi-Wisata-Batu-Kapal-Liliboi.jpg", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView batukapal = (CardView) findViewById(R.id.mapsbatukapal);
        batukapal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsBatuKapal.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}