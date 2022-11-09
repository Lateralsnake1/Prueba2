package com.example.prueba2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class EnlaceSQL extends SQLiteOpenHelper {
    public EnlaceSQL(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
    super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqlBD) {
    sqlBD.execSQL("create table Proyecto(NombreProyecto varchar(100) not null primary key, TipoFigura varchar (100), Base Double, Altura Double, Area Double)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
