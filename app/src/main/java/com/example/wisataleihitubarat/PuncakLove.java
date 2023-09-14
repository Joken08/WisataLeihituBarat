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

public class PuncakLove extends AppCompatActivity {

    private CardView back, mapspuncaklove;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puncak_love);

        back = findViewById(R.id.back);
        mapspuncaklove = findViewById(R.id.mapspuncaklove);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377263033_147026841796814_5923169357442907097_n.jpg?stp=cp6_dst-jpg&_nc_cat=109&ccb=1-7&_nc_sid=5614bc&_nc_ohc=bDYO81LxmOwAX9BQJM6&_nc_ht=scontent.fupg5-1.fna&oh=00_AfD2Qw4vppif7XetC7Ghh6EQ37-cbSu12MW5NLLM2LI-BQ&oe=6502D0D7", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377430943_147026898463475_1533350017638262703_n.jpg?stp=cp6_dst-jpg&_nc_cat=110&ccb=1-7&_nc_sid=5614bc&_nc_ohc=wdHR9gtWZdIAX_N0jKA&_nc_ht=scontent.fupg5-1.fna&oh=00_AfDI-ZwlEU-Z636t9GIgdmdKSMN1Ebxg92uDJ8L6IlsIvQ&oe=6503BC7A", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377877178_147026918463473_628350777950749540_n.jpg?stp=cp6_dst-jpg&_nc_cat=106&ccb=1-7&_nc_sid=5614bc&_nc_ohc=thwbLH3K2j4AX8Mrtaj&_nc_ht=scontent.fupg5-1.fna&oh=00_AfDqxtN6rdjXKNonrMXNPhC5iD6XLF7rYV2W1jRuJa1l-g&oe=6503825C", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377275641_147026858463479_8857042924950714786_n.jpg?stp=cp6_dst-jpg&_nc_cat=111&ccb=1-7&_nc_sid=5614bc&_nc_ohc=YjnoFGRg3VcAX-SsdAg&_nc_oc=AQnDnR15jGCHEFm0PoOXkMeYGSGNPAFgbudPYvA4Xhaya6DxSf8QS6Tla48fxRIvdZ8&_nc_ht=scontent.fupg5-1.fna&oh=00_AfCZyAOfzKE0-JO3-hHmBZinBRDdvPwIveiQGa3BZ-iCPg&oe=6503E262", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377458036_147026888463476_1605969086809890689_n.jpg?stp=cp6_dst-jpg&_nc_cat=102&ccb=1-7&_nc_sid=5614bc&_nc_ohc=quMU8s3mbKgAX88ouq_&_nc_ht=scontent.fupg5-1.fna&oh=00_AfBbc_sw58RzylvJD7igeVWWM1Bh2suhVs21d-NQRLMAmg&oe=6503F7D7", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView puncaklove = (CardView) findViewById(R.id.mapspuncaklove);
        puncaklove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsPuncakLove.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}