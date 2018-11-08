package com.example.sergio.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txtResult);
    }

    //creamos unavariable de tipo button y lo igualamos a la vista que nos pasan por ahi pero cvateandola con button
    public void clickButton(View view) {
    Button currentButton = (Button) view;
        result+=currentButton.getText();
        txtResult.setText(result);
        //lo tendremos que convertir a un float o l oque sea
    }
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
