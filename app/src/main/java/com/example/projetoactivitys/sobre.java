package com.example.projetoactivitys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }

    public void botaoVoltarTelaInicial (View v) {
        Intent telaPrincipal = new Intent(this, MainActivity.class);
        startActivity(telaPrincipal);
    }

    public void botaoPaginaUniftec (View v) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br")));
    }

}


