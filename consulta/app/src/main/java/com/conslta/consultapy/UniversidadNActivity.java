package com.conslta.consultapy;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.conslta.consultapy.contactoUni.ContactoUniActivity;
import com.conslta.consultapy.contactoUni.InfoMuniActivity;
import com.conslta.consultapy.uni.AgronomiaActivity;
import com.conslta.consultapy.uni.ArancelUniActivity;
import com.conslta.consultapy.uni.CienciasEActivity;
import com.conslta.consultapy.uni.CyTActivity;
import com.conslta.consultapy.uni.DerechoActivity;
import com.conslta.consultapy.uni.HumanidadesActivity;
import com.conslta.consultapy.uni.InfoUniActivity;
import com.conslta.consultapy.uni.IngenieriaActivity;
import com.conslta.consultapy.uni.MapsUniActivity;
import com.conslta.consultapy.uni.MedicinaActivity;
import com.conslta.consultapy.uni.RectoradoActivity;

public class UniversidadNActivity extends AppCompatActivity {

    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;
    private ImageButton imageButtonMu;

    LinearLayout contactoUni2, ubicacionUni,infoUni, arancelUni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidad_n);

        infoUni = findViewById(R.id.infoUni);
        ubicacionUni = findViewById(R.id.ubicacionUni);
        contactoUni2 = findViewById(R.id.contactoUni);

        arancelUni = findViewById(R.id.ArancelUni);






        infoUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversidadNActivity.this, InfoUniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        ubicacionUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversidadNActivity.this, MapsUniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        contactoUni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversidadNActivity.this, ContactoUniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        arancelUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversidadNActivity.this, ArancelUniActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
