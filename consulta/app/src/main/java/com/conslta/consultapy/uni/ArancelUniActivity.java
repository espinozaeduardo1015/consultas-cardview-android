package com.conslta.consultapy.uni;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.conslta.consultapy.R;
import com.conslta.consultapy.contactoUni.ContactoUniActivity;
import com.conslta.consultapy.contactoUni.InfoMuniActivity;

//public class ArancelUniActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_arancel_uni);
//    }
//}
public class ArancelUniActivity extends AppCompatActivity {

    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;
    private ImageButton imageButtonMu;

    LinearLayout  rectoradoUni2, ciencias_tecnologia, humanidadesB,
            derechoB, ciencias_economicas, agronomiaB, ingenieriaB, medicinaB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arancel_uni);

        rectoradoUni2 = findViewById(R.id.rectoradoUni);

        ciencias_tecnologia = findViewById(R.id.cienciasTecnologia);

        humanidadesB = findViewById(R.id.humanidades);

        derechoB = findViewById(R.id.derecho);

        ciencias_economicas = findViewById(R.id.cienciasEconomicas);

        agronomiaB = findViewById(R.id.agronomia);

        ingenieriaB = findViewById(R.id.ingenieria);


        medicinaB = findViewById(R.id.Medicina);

        medicinaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, MedicinaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        ingenieriaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, IngenieriaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        agronomiaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, AgronomiaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        ciencias_economicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, CienciasEActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        derechoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, DerechoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        humanidadesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, HumanidadesActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });


        ciencias_tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, CyTActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });





        rectoradoUni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.conslta.consultapy.uni.ArancelUniActivity.this, RectoradoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}