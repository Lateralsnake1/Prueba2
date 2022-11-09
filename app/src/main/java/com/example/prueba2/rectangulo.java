package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        EditText BaseRec =(EditText) findViewById(R.id.baserec);
        EditText AlturaRec =(EditText) findViewById(R.id.alturarec);
        Button CalcularAreaRec = (Button) findViewById(R.id.botoncalrec);
        TextView ResultadoTri =(TextView) findViewById(R.id.resultrec);

        CalcularAreaRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Base = Double.parseDouble(BaseRec.getText().toString());
                Double Altura = Double.parseDouble(AlturaRec.getText().toString());
                double proceso = Base*Altura;
                ResultadoTri.setText("Area: "+proceso+"Cm²");
            }
        });


    }
}