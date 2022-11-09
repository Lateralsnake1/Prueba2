package com.example.prueba2;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GuardarDatos extends AppCompatActivity {
    EditText NombreProyecto, TipoFigura, Base, Altura, Area;
    @Override
    protected void onCreate(Bundle savenInstanceState){
        super.onCreate(savenInstanceState);
        setContentView(R.layout.activity_guardar_tri);
        NombreProyecto = (EditText)findViewById(R.id.NDP);
        TipoFigura = (EditText)findViewById(R.id.TF);
        Base = (EditText)findViewById(R.id.Baseid);
        Altura = (EditText)findViewById(R.id.Alturaid);
        Area = (EditText)findViewById(R.id.Areaid);
    }

    public void GuardarProyecto(View view){
        EnlaceSQL BaseDeDatos = new EnlaceSQL(this, "Prueba2", null, 1);
        SQLiteDatabase BDD = BaseDeDatos.getWritableDatabase();

        String nombreProyecto = NombreProyecto.getText().toString();
        String tipoFigura = TipoFigura.getText().toString();
        Double base = Double.parseDouble(Base.getText().toString());
        Double altura = Double.parseDouble(Altura.getText().toString());
        Double area = Double.parseDouble(Area.getText().toString());

        ContentValues pack = new ContentValues();

        pack.put("NombreProyecto", nombreProyecto);
        pack.put("TipoFigura", tipoFigura);
        pack.put("Base", base);
        pack.put("Altura",altura);
        pack.put("Area", area);

        BDD.insert("Proyecto", null,pack);

        BDD.close();

        Toast.makeText(this, "Creado Correctamente", Toast.LENGTH_SHORT).show();
    }
    public void Guardar(View v) {
        Intent gg = new Intent(this, MainActivity.class);
        startActivity(gg);
    }
    public void Consultar(View v){

        EnlaceSQL BaseDeDatos = new EnlaceSQL(this, "Prueba2", null, 1);
        SQLiteDatabase BDD = BaseDeDatos.getWritableDatabase();
        String nombreProyecto = NombreProyecto.getText().toString();
        if(!nombreProyecto.isEmpty()){
            Cursor Guardar = BDD.rawQuery("SELECT NombreProyecto, TipoFigura, Base, Altura, Area FROM Proyecto WHERE NombreProyecto="+ nombreProyecto,null);
            if(Guardar.moveToFirst()){
                NombreProyecto.setText(Guardar.getString(0));
                TipoFigura.setText(Guardar.getString(1));
                Base.setText(Guardar.getString(2));
                Altura.setText(Guardar.getString(3));
                Area.setText(Guardar.getString(4));
                BDD.close();

            }
            else{
                Toast.makeText(this, "No existe este Proyecto", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

