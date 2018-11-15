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
        //no siempre es "getStringExtra" se segun la variable que pasamos
        String nombre=intent.getStringExtra(MainActivity.USER);
        // cogerá el nombre de la caja , COGEMOS NOMBRE DE LA CAJA
        //String nombre=intent.getStringExtra("username");username tiene que ser el nombre exacto de MainActivity

        //la caja que se llama user , el contenedor llamado user
        txtNombre.setText(nombre);
        //ahora le PONEMOS EL VALOR DE LO QUE HAY EN LA CAJA !!!
        //ANTES TENDREMOS QUE TENER CREADO EL txtNombre, var java, que coge el txtNmbre(valor en layout)

    }
}
