package com.example.wisataleihitubarat;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.wisataleihitubarat.databinding.ActivityMapsHuluwaBinding;

public class MapsHuluwa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsHuluwaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsHuluwaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng huluwa = new LatLng(-3.774405, 127.9332036);
        mMap.addMarker(new MarkerOptions().position(huluwa).title("HULUWA BEACH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(huluwa));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}