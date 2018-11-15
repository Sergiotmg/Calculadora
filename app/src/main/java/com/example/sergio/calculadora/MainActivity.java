package com.example.sergio.calculadora;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    String result="";
    //son codigs de peticion para que no se nos olvide de que nº es cad auno , ai no nos tenemos que acordar que el de settings era el 1
    //el de 2 era el de help, etc,etc
    public static int REQUEST_SETTINGS=1;
    public static int REQUEST_HELP=2;
    public static int REQUEST_SHARE=3;

    public static final String USER="user";//para que sea cte es final y static par allamarla desde otra activity


    // inicializamos lo de toolbar
    Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        txtResult=findViewById(R.id.txtResult);
    }

    //creamos unavariable de tipo button y lo igualamos a la vista que nos pasan por ahi pero cvateandola con button
    public void clickButton(View view) {
    Button currentButton = (Button) view;
        result+=currentButton.getText();
        txtResult.setText(result);
        //lo tendremos que convertir a un float o l oque sea
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);// nos referimos al archivo xml creado en res/menu
        // HAY QUE PONER EL GETMENU ARRIBA DEL RETURN!!!!!!!!!!!!!!!!!!
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //hacerlo con un switch
        //darme el ide de cada item que le pasemos al metodo
        switch (item.getItemId()){
            case  R.id.action_settings://action_devolver
                Toast.makeText(this,"Click en settings",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(this,Main3Activity.class);
                        //si no queremos pasar datoa a la 2ª no hace falta intent.puExtra!!!
                //intent.putExtra("nombre","Nacho");//nombre es el Extramessage
                //no hay porque cambiarle el nombre en los putExtra, recogerá nombre
                startActivityForResult(intent,REQUEST_SETTINGS);//request_setting ses el codigo de PETICION

            break;
            case  R.id.action_help:
                Toast.makeText(this,"Click en help",Toast.LENGTH_LONG).show();
                Intent intent2=new Intent(this,Main4Activity.class);
                //intent2.putExtra("nombre","Nacho");
                startActivityForResult(intent2,REQUEST_HELP);
                //IMAGINAROS QUE SI EL USUARIO LOGEA SERIA UN RESULToK
                // si fuera con un result cancel
            break;
            case R.id.action_share:
                Toast.makeText(this,"Click en share",Toast.LENGTH_LONG).show();
                Intent intent3=new Intent(this,Main5Activity.class);
                //PARA PASAR EL VALOR AL activity_main5!!! E SCUANDO LE PONEMOS VALORES
                String nombre="Sergio";
                //el primer valor es el nombre que le pongo dentro de mi intent
                intent3.putExtra(USER,nombre);//meterle la variable user con mombre Sergio
                startActivity(intent3);//lanza actividad pero no va adevoler ningun valor

                //startActivityForResult(intent3,REQUEST_SHARE);
            break;
            default:
                Toast.makeText(this,"Switch default",Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    //METODO APARTE PARA VER LO QUE NOS LLEGA DEL REQUEST(CODIGO DE PETICION) , Y EL CODIGO DE RESULTADO
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //si vienes desde tal o cual actividades haches tal o cual cosa
        if(requestCode==REQUEST_SETTINGS){
            if (resultCode==RESULT_OK){
                String nombre=data.getStringExtra(Main3Activity.REPLY);//lo habia llamado nombre en la otra
                //`poner el nombre en el toolbar
                getSupportActionBar().setTitle(nombre);
            }
        }else if (requestCode==REQUEST_HELP){

        }else if(requestCode==REQUEST_SHARE){

        }
    }

//    public View getView){
//
//    }

    private  int plus(int x, int y){
        return x+y;
    }

    private  int rest(int x, int y){
        return x-y;
    }

    private  int por(int x, int y){
        return x*y;
    }

    private  int div(int x, int y){
        return x/y;
    }



}
