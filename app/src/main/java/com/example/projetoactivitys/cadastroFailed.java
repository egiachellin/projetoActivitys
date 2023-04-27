package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cadastroFailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrofalhou);
    }
    public void botaoVoltarTelaCadastro (View v) {
        Intent telaCadastro = new Intent(this, cadastro.class);
        startActivity(telaCadastro);
    }
}



