package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void botaoCadastraronClick (View v) {
        EditText nome = (EditText) findViewById(R.id.nome);
        EditText endereco = (EditText) findViewById(R.id.endereço);
        EditText numero = (EditText) findViewById(R.id.numero);
        EditText cep = (EditText) findViewById(R.id.cep);
        EditText complemento = (EditText) findViewById(R.id.complemento);

        String nomeDigitado = nome.getText().toString();
        String enderecoDigitado = endereco.getText().toString();
        String numeroDigitado = numero.getText().toString();
        String cepDigitado = cep.getText().toString();
        String complementoDigitado = complemento.getText().toString();

        if (nomeDigitado.isEmpty() || enderecoDigitado.isEmpty() ||numeroDigitado.isEmpty() ||cepDigitado.isEmpty() ||complementoDigitado.isEmpty()) {
            Intent cadastroFalhou = new Intent(this, cadastroFailed.class);
            startActivity(cadastroFalhou);
        } else {
            Intent cadastroSucesso = new Intent(this, cadastroSucesso.class);
            cadastroSucesso.putExtra("nomeDigitado", nomeDigitado);
            startActivity(cadastroSucesso);
        }
    }

}
