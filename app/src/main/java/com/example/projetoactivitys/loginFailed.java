package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class loginFailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfalhou);
    }
    public void botaoVoltarTelaLogin (View v) {
        Intent telaLogin = new Intent(this, login.class);
        startActivity(telaLogin);
    }
}



