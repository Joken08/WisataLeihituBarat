package com.example.wisataleihitubarat;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.wisataleihitubarat.databinding.ActivityMapsPancurannKuningBinding;

public class MapsPancurannKuning extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsPancurannKuningBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsPancurannKuningBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng pancurannkuning = new LatLng(-3.7375746, 127.923245);
        mMap.addMarker(new MarkerOptions().position(pancurannkuning).title("PANCURAN KUNING"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pancurannkuning));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}