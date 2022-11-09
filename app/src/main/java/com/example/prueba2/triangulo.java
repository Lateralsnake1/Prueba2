package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        Button CalcularAreaTri = (Button) findViewById(R.id.botoncaltri);
        TextView ResultadoTri =(TextView) findViewById(R.id.resulttri);
        EditText BaseTri =(EditText) findViewById(R.id.basetri);
        EditText AlturaTri =(EditText) findViewById(R.id.alturatri);

        CalcularAreaTri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    Double base = Double.parseDouble(BaseTri.getText().toString());
                    Double altura = Double.parseDouble(AlturaTri.getText().toString());
                    double proceso = (base * altura)/2;
                    ResultadoTri.setText("Area: "+proceso+"Cm²");
            }
        });

    }
    public void siguiente(View v){
        Intent g = new Intent(this, GuardarTri.class);
        startActivity(g);
    }
}