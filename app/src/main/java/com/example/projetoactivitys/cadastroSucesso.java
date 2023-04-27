package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class cadastroSucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsucesso);

        TextView textNome = (TextView) findViewById(R.id.textView3);
        Intent telaCadastro = getIntent();

        String nome = telaCadastro.getStringExtra("nomeDigitado");

        textNome.setText("Olá " + nome);
    }
    public void botaoSobreOnClick (View v) {
        Intent telaSobre = new Intent(this, sobre.class);
        startActivity(telaSobre);
    }
}



