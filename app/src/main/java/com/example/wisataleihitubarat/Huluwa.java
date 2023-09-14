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

public class Huluwa extends AppCompatActivity {

    private CardView back, mapshuluwa;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huluwa);

        back = findViewById(R.id.back);
        mapshuluwa = findViewById(R.id.mapshuluwa);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://asset-2.tstatic.net/ambon/foto/bank/images/pantai-huluwa-wakasihuuuu.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.celebes.co/maluku/wp-content/uploads/2021/05/Pantai-Huluwa.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://t-2.tstatic.net/ambon/foto/bank/images/parkir-pantai-huluwaaaa.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t1.18169-9/17155862_1267040376712015_2495638665093464978_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=19026a&_nc_ohc=pBf-HCctz3YAX9o4nxA&_nc_ht=scontent.fupg5-1.fna&oh=00_AfBpMw09OJ5aaONOsF08Jy-yBV17ASOHP_Z3IgC2Q-O8Og&oe=652639BB", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://blog.tiket.com/wp-content/uploads/Image-Blog_Pantai-Huluwa-2.jpg", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView huluwa = (CardView) findViewById(R.id.mapshuluwa);
        huluwa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsHuluwa.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}