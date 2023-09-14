package com.example.wisataleihitubarat;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.wisataleihitubarat.databinding.ActivityMapsBatuDuaCafeBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.wisataleihitubarat.databinding.ActivityMapsBatuKapalBinding;

public class MapsBatuKapal extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBatuKapalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBatuKapalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng batu_kapal = new LatLng(-3.7430841, 128.0296516);
        mMap.addMarker(new MarkerOptions().position(batu_kapal).title("BATU KAPAL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batu_kapal));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}