package com.conslta.consultapy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

//public class CorreoActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_correo);
//
//
//        WebView webView = (WebView) findViewById(R.id.webWiewCorreo);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.setWebViewClient(new WebViewClient());
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.loadUrl("https://mail.google.com/mail/u/0/#inbox?compose=new");
//    }
//}
public class CorreoActivity extends Activity implements View.OnClickListener {
    private static final String tag = "Main";
    private Button botonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        this.botonEmail = (Button) this.findViewById(R.id.btnEmail);
        this.botonEmail.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Verificamos si el usuario ha hecho click en el Boton de Enviar Email
        if (view == this.botonEmail) {
            //Llamamos al metodo enviarEmail
            enviarEmail();
        }
    }

    private void enviarEmail(){
        //Instanciamos un Intent del tipo ACTION_SEND
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        //Aqui definimos la tipologia de datos del contenido dle Email en este caso text/html
        emailIntent.setType("text/html");
        // Indicamos con un Array de tipo String las direcciones de correo a las cuales enviar
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"espinozaeduardo1015@gmail.com"});
        // Aqui definimos un titulo para el Email
        emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, "El Titulo");
        // Aqui definimos un Asunto para el Email
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "El Asunto");
        // Aqui obtenemos la referencia al texto y lo pasamos al Email Intent
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, getString(R.string.denuncia));
        try {
            //Enviamos el Correo iniciando una nueva Activity con el emailIntent.
            startActivity(Intent.createChooser(emailIntent, "Enviar Correo..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(CorreoActivity.this, "No hay ningun cliente de correo instalado.", Toast.LENGTH_SHORT).show();
        }
    }
}