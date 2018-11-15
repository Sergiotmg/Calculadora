package com.example.sergio.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText etNombre;
    public static final String REPLY="asaadads";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //creamos tras el setcontente siempre el nombre , para relacionar mi etNombre en el layout con el
        // etnombre del .java
        etNombre=findViewById(R.id.etNombre);
    }

    public void devolverNombre(View view) {
        //el valor dentro de etNombre
        String name=etNombre.getText().toString();//etnombre.getText() solo no se puede igualar una
        // clase de textode android a uan clase de string da java

        //si no esta vacio hacemos algo
        if (!name.isEmpty()){
            //es un nombre y
            //siempre que pongo put extra el 1er valor es el bnombre del intent, guardo una variable llamada nombre y de valor lo que tenga dentrodel edittext
            Intent intent=new Intent();
            intent.putExtra(REPLY,name);//le paso caja +valor
            setResult(RESULT_OK,intent);//que el resultado ha ido bien y le paso mis datos y OJO! UN INTENT PUEDE RE
            //CIBIR MAS DE UN DATO, puede recibir muchas variable sun intent, pero n opasar un video 0.5MB aprox hasta 128 variables
            // el set result LANZA EL METODO onActivityResult en el MainActivity

            finish();// le pasamos al 1 el nombre le pasamo el tipo de result

        }
    }
    public void cancelarAccion(View view) {
        //el valor dentro de etNombre
        String name=etNombre.getText().toString();//etnombre.getText() solo no se puede igualar una
        // clase de textode android a uan clase de string da java

        //si no esta vacio hacemos algo
        if (!name.isEmpty()){
            //es un nombre y
            //siempre que pongo put extra el 1er valor es el bnombre del intent, guardo una variable llamada nombre y de valor lo que tenga dentrodel edittext
            Intent intent=new Intent();
            intent.putExtra(REPLY,name);//le paso caja +valor, NAME ESTA ARRIBA
            setResult(RESULT_OK,intent);//que el resultado ha ido bien y le paso mis datos y OJO! UN INTENT PUEDE RE
            // el set result LANZA EL METODO onActivityResult en el MainActivity

            //CIBIR MAS DE UN DATO, puede recibir muchas variable sun intent, pero n opasar un video 0.5MB aprox hasta 128 variables

            finish();// le pasamos al 1 el nombre le pasamo el tipo de result

        }
    }
}
