package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);


        EditText RadioCir = (EditText) findViewById(R.id.radiocir);
        Button CalcularAreaCir = (Button) findViewById(R.id.botoncalcir);
        TextView ResultadoCir = (TextView) findViewById(R.id.resultcir);

        CalcularAreaCir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double radiocirculo = Double.parseDouble(RadioCir.getText().toString());
                double proceso = (radiocirculo * radiocirculo)*3.1416;
                ResultadoCir.setText("Area: "+proceso+"Cm²");
            }
        });
    }
}