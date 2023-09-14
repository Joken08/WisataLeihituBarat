package com.example.wisataleihitubarat;

import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;

import android.app.ActionBar;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.wisataleihitubarat.databinding.ActivityMapsBatuDuaCafeBinding;

public class MapsBatuDuaCafe extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBatuDuaCafeBinding binding;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBatuDuaCafeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng batu_dua_cafe = new LatLng(-3.7233119, 128.0703853);
        mMap.addMarker(new MarkerOptions().position(batu_dua_cafe).title("BATU DUA CAFE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batu_dua_cafe));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}