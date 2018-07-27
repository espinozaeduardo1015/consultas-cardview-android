package com.conslta.consultapy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.conslta.consultapy.PoderJudicial.ArancelPActivity;
import com.conslta.consultapy.PoderJudicial.InfoPjActivity;
import com.conslta.consultapy.PoderJudicial.PoderJActivity;
import com.conslta.consultapy.PoderJudicial.contactoPActivity;
import com.conslta.consultapy.contactoUni.ArancelMuniActivity;
import com.conslta.consultapy.contactoUni.ContactoMuniActivity;
import com.conslta.consultapy.contactoUni.ContactoUni;
import com.conslta.consultapy.contactoUni.InfoMuniActivity;
import com.conslta.consultapy.contactoUni.MapsMuniActivity;

public class MunicipalidadActivity extends AppCompatActivity {
    LinearLayout contactoMuni, infoMuni, mapsMuni, arancelMuni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipalidad);

        contactoMuni = findViewById(R.id.contactoMuni);
        infoMuni= findViewById(R.id.infoMuni);
        mapsMuni= findViewById(R.id.mapsMuni);
        arancelMuni= findViewById(R.id.arancelM);


        contactoMuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MunicipalidadActivity.this, ContactoMuniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        arancelMuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MunicipalidadActivity.this, ArancelMuniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });


        infoMuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MunicipalidadActivity.this, InfoMuniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        mapsMuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MunicipalidadActivity.this, MapsMuniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
