package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Producto_act extends AppCompatActivity {
    private RadioButton kilo1, kilo2;
    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        kilo1 = (RadioButton) findViewById(R.id.rb1);
        kilo2 = (RadioButton) findViewById(R.id.rb2);
        texto = (TextView) findViewById(R.id.txt2);
    }

    public void calcular(View view) {
        if (kilo1.isChecked()) {
            int resultado = 1000 * 1;
            texto.setText("El kilo es:" + resultado);
        } else {
            int resultado = 1000 * 2;
            texto.setText("Los dos kilos son: " + resultado);

        }
    }
    public void volver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
