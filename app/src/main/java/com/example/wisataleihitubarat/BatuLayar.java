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

public class BatuLayar extends AppCompatActivity {

    private CardView back, batulayar;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu_layar);

        back = findViewById(R.id.back);
        batulayar = findViewById(R.id.mapsbatulayar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://i.ytimg.com/vi/qnLqpVVA3Ww/maxresdefault.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/08/9f/f5/the-rock-formation-batu.jpg?w=1200&h=-1&s=1", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377877187_147506108415554_5010635136405428488_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5614bc&_nc_ohc=BRAkeQoMJpIAX-53_Hi&_nc_ht=scontent.fupg5-1.fna&oh=00_AfArErjFoEfwmn7fMs_By9fajLiGXvuCwyquN11VJM9oew&oe=65048691", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377766502_147506151748883_3253236524850221444_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=5614bc&_nc_ohc=L9RJGcVKr4wAX-AU4rY&_nc_oc=AQlvB67iV87z76pgp6RTeKspfn-INkUPm_1u2Exp1248e4F7vkYfDkcegqz4xWPLNI0&_nc_ht=scontent.fupg5-1.fna&oh=00_AfB-BCGAr2eNwuwHYNcxj9pBAG7jvJ2W0JoHZ7ky4Q2YsQ&oe=65038FB6", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377263041_147506098415555_5974420018740320929_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5614bc&_nc_ohc=SwhSZmHzwr4AX95l8tv&_nc_ht=scontent.fupg5-1.fna&oh=00_AfDlEUmy1wVOcq2baCMoGVHzSnpq8cNsA3sS0qpyi5IfBg&oe=65036DF0", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView batulayar = (CardView) findViewById(R.id.mapsbatulayar);
        batulayar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsBatuLayar.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}