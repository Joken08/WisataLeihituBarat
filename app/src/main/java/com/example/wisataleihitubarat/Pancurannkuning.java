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

public class Pancurannkuning extends AppCompatActivity {

    private CardView back, mapspancurannkuning;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancurannkuning);

        back = findViewById(R.id.back);
        mapspancurannkuning = findViewById(R.id.mapspancurannkuning);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Wisata.class));
            }
        });

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/376243929_147425188423646_2991197246098172937_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=5614bc&_nc_ohc=ENYnRyuQInEAX-JR7oD&_nc_ht=scontent.fupg5-1.fna&oh=00_AfBxQL4txBUA_4xRDP88xUWo0HXiteIcgqd9BiJhIeAZiQ&oe=6504CDB0", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377440212_147425395090292_1941646357312722183_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5614bc&_nc_ohc=vuLwFgMU9-0AX_6xrw8&_nc_ht=scontent.fupg5-1.fna&oh=00_AfAnPhBwexQkyHPSN02F6flNJwEN2xkYpU80KuiNvdV1Kw&oe=65042725", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/378277037_147425421756956_1890109263821331554_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5614bc&_nc_ohc=_6QJC9JYa8YAX8nXY3N&_nc_ht=scontent.fupg5-1.fna&oh=00_AfDAv9WqZ1bf2fSwroG8cXTiQJeFe52SslF4YnYmFw4kVQ&oe=65040459", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/377436131_147425388423626_5514501576002957517_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5614bc&_nc_ohc=Y21uZafA0pkAX_Lq9gJ&_nc_ht=scontent.fupg5-1.fna&oh=00_AfCr3L5evdD-dEm13zrT0Br9Esmlp9aDwcPaINl7d37D8g&oe=6503A7B7", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent.fupg5-1.fna.fbcdn.net/v/t39.30808-6/378275746_147425408423624_3575791690828357314_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=5614bc&_nc_ohc=65JZpmBrxfIAX9vSqvs&_nc_ht=scontent.fupg5-1.fna&oh=00_AfAIR9lW-WqqvYR6KPcP3S64OfUMutAZEAitEvxjoxOUIQ&oe=65051969", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView pancurannkuning = (CardView) findViewById(R.id.mapspancurannkuning);
        pancurannkuning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rowan) {
                Intent myIntent = new
                        Intent(rowan.getContext(),MapsPancurannKuning.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}