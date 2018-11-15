package com.example.sergio.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView txtNombre =findViewById(R.id.txtNombre);

        //PONER L AVARIABLE QUE NOS PASAN DE LA 1ª ACT
        Intent intent= getIntent();
        //no siempre es getstring extra ses egun la vairable que pasamos
        String nombre=intent.getStringExtra(MainActivity.USER);
        //String nombre=intent.getStringExtra("username");username tiene que ser el nombre exacto de MainActivity

        //la caja que se llama user , el contenedor llamado user
        txtNombre.setText(nombre);
        //

    }
}
