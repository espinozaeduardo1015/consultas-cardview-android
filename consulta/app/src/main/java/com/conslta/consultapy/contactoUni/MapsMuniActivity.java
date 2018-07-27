package com.conslta.consultapy.contactoUni;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.conslta.consultapy.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsMuniActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mapamuni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_muni);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());

        if (status == ConnectionResult.SUCCESS) {

            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.mapamuni);
            mapFragment.getMapAsync(this);
        } else {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, (Activity) getApplicationContext(), 10);
            dialog.show();
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapamuni = googleMap;

        mapamuni.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        UiSettings uiSettings =mapamuni.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-27.338405, -55.866110);
        mapamuni.addMarker(new MarkerOptions().position(sydney).title("Municipalidad de Encarnacion").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        float zoomlevel = 16;

        mapamuni.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, zoomlevel));

    }
}
