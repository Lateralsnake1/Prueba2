package com.example.prueba2;

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
            public void Triangulo(View v){

                Intent i = new Intent(this, triangulo.class);
                startActivity(i);
            }
            public void Circulo(View v){
                Intent o = new Intent(this, circulo.class);
                startActivity(o);
            }
            public void Rectangulo(View v){
                Intent u = new Intent(this, rectangulo.class);
                startActivity(u);
            }
        }
