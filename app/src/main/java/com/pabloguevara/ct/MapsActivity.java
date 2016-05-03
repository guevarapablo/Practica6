package com.pabloguevara.ct;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        int flag=0;
        Intent i = getIntent();
        int flag2 = i.getIntExtra("key",flag);

        switch (flag2){
            case 0:{
                LatLng inicio = new LatLng(6.567299, -75.517040);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(inicio));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
                mMap.addMarker(new MarkerOptions().position(inicio).title("Entrerríos").snippet("Antioquia"));
            }
                break;
            case 1:{
                LatLng capilla = new LatLng(6.567144, -75.516761);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(capilla));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(capilla).title("Capilla del Río").snippet("Hotel"));
            }
            break;
            case 2:{
                LatLng porton = new LatLng(6.566840, -75.517571);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(porton));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(porton).title("Portón del Norte").snippet("Hotel"));
            }
            break;
            case 3:{
                LatLng villa = new LatLng(6.566167, -75.515442);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(villa));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(villa).title("Hostal Villalobos").snippet("Hotel"));
            }
            break;
            case 4:{
                LatLng mompox = new LatLng(6.567467, -75.517315);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mompox));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(mompox).title("Mompox").snippet("Discoteca"));
            }
            break;
            case 5:{
                LatLng vip = new LatLng(6.567108, -75.517261);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(vip));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(vip).title("VIP").snippet("Discobar"));
            }
            break;
            case 6:{
                LatLng zarzo = new LatLng(6.566840, -75.518011);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(zarzo));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                mMap.addMarker(new MarkerOptions().position(zarzo).title("Zarzo").snippet("Café-Bar"));
            }
            break;
            case 7:{
                LatLng embalse = new LatLng(6.510779, -75.539610);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(embalse));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
                mMap.addMarker(new MarkerOptions().position(embalse).title("Mirador Embalse").snippet("Turismo"));
            }
            break;
            case 8:{
                LatLng piedra = new LatLng(6.542393, -75.521527);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(piedra));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
                mMap.addMarker(new MarkerOptions().position(piedra).title("Piedra del Peñol").snippet("Turismo"));
            }
            break;
            case 9:{
                LatLng truchera = new LatLng(6.579114, -75.540658);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(truchera));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
                mMap.addMarker(new MarkerOptions().position(truchera).title("Truchera El Lago").snippet("Turismo"));
            }
            break;

        }
    }
}
