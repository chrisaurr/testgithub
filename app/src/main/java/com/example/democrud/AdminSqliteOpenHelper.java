package com.example.democrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSqliteOpenHelper extends SQLiteOpenHelper {

    private final String sql = "CREATE TABLE articulos(codigo int primary key, descripcion text, precio real, cantidad Integer)";
    //private final String sql_clientes = "CREATE TABLE clientes(codigo int primary key, nombre text, direccion text)";

    public AdminSqliteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
        //llenar_tabla();
        //db.execSQL(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS articulos");
        onCreate(db);
    }

    public void llenar_tabla(SQLiteDatabase db){
        //String sql = "insert into articulos values(1, 'tomate', '10', '1')" +
                //"insert into articulos values(2, 'coca cola', '10', '1')";
        //db.execSQL(sql);
    }
}
