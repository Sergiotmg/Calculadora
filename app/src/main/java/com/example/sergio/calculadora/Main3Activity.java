package com.example.sergio.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    public static String nombre="nombre";
    EditText etNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etNombre=findViewById(R.id.etNombre);
    }

    public void devolverNombre(View view) {

        String name=etNombre.getText().toString();
        //si no esta vacio hacemos algo
        if (!name.isEmpty()){
            //es un nombre y
            //siempre que pongo put extra el 1er valor es el bnombre del intent, guardo una variable llamada nombre y de valor lo que tenga dentrodel edittext
            Intent intent=new Intent();
            //intent.putExtra(nombre,name);
            intent.putExtra(nombre,name);
            setResult(RESULT_OK,intent);
            finish();// le pasamos al 1 el nombre le pasamo el tipo de result

        }
    }
}
