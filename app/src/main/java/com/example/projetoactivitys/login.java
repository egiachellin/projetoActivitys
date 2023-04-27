package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void botaoLogarOnClick (View v) {
        EditText email = (EditText) findViewById(R.id.nome);
        EditText senha = (EditText) findViewById(R.id.endereço);

        String emailDigitado = email.getText().toString();
        String senhaDigitada = senha.getText().toString();

        String emailDefault = "eduardo@gmail.com";
        String senhaDefault = "senhasegura";

        if(emailDigitado.isEmpty() || senhaDigitada.isEmpty()) {
            Intent loginFalhou = new Intent(this, loginFailed.class);
            startActivity(loginFalhou);
        } else if (!emailDigitado.equals(emailDefault) && !senhaDigitada.equals(senhaDefault)) {
            Intent loginFalhou = new Intent(this, loginFailed.class);
            startActivity(loginFalhou);
        } else {
            Intent loginSucesso = new Intent(this, loginSucesso.class);
            startActivity(loginSucesso);
        }
    }

    public void botaoVoltarOnClick (View v) {
        Intent telaLogin = new Intent(this, MainActivity.class);
        startActivity(telaLogin);
    }

}