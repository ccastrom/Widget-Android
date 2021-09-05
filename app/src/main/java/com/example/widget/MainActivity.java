package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //declaración
    private ProgressBar barra;
    private CheckBox calificaciones, productos;
    private TextView texto;
    private int progreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barra=(ProgressBar)findViewById(R.id.progressBar);
        calificaciones=(CheckBox)findViewById(R.id.ch1);
        productos=(CheckBox)findViewById(R.id.ch2);
        texto=(TextView)findViewById(R.id.txtMain);
    }
    public void charge(View view){
        final Timer t= new Timer();//declarar temporizador
        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                //rellenar progressbar
                progreso++;
                barra.setProgress(progreso);
                int pro= barra.getProgress();
                texto.setText("Progreso actual: "+pro);

            }
        };
        t.schedule(tarea,0,100);
    }
    public void menu(View view){
        if(calificaciones.isChecked()&& productos.isChecked()){
            texto.setText("Seleccione una opcion");
        }else{
            if(calificaciones.isChecked()){
                Intent i = new Intent(this,Calificaciones_act.class);
                startActivity(i);
            }else{
                Intent i = new Intent(this,Producto_act.class);
                startActivity(i);
            }
        }
    }
}