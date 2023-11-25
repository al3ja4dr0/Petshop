package com.Tienda.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Configuracion del IMGBUTTON Entrar
    public void Entrar(View view){
        Intent Entrar = new Intent(this, MainActivity2.class);
        startActivities(new Intent[]{Entrar});
    }
}