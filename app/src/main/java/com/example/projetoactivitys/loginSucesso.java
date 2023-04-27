package com.example.projetoactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class loginSucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsucesso);
    }
    public void botaoSobreOnClick (View v) {
        Intent telaSobre = new Intent(this, sobre.class);
        startActivity(telaSobre);
    }
}



