package com.example.wisataleihitubarat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Wisata extends AppCompatActivity {
    private CardView back, batuduacafe, batukapal, puncaklove, huluwa, pancurannkuning, batulayar, kolammorea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        back = findViewById(R.id.back);
        batuduacafe = findViewById(R.id.batuduacafe);
        batukapal = findViewById(R.id.batukapal);
        puncaklove = findViewById(R.id.puncaklove);
        huluwa = findViewById(R.id.pantaihuluwa);
        pancurannkuning = findViewById(R.id.pancurannkuning);
        batulayar = findViewById(R.id.batulayar);
        kolammorea = findViewById(R.id.kolammorea);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        batuduacafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BatuDuaCafe.class));
            }
        });

        batukapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BatuKapal.class));
            }
        });

        puncaklove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PuncakLove.class));
            }
        });

        huluwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Huluwa.class));
            }
        });

        pancurannkuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Pancurannkuning.class));
            }
        });

        batulayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BatuLayar.class));
            }
        });

        kolammorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), KolamMorea.class));
            }
        });

    }
}