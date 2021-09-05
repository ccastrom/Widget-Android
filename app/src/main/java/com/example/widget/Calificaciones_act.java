package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Calificaciones_act extends AppCompatActivity {
    private RatingBar calificacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);
        calificacion=(RatingBar)findViewById(R.id.rt);
    }
    public void calificar(View view){
        calificacion.setRating(4);
        float rat=calificacion.getRating();
        Toast.makeText(this,"Calificación es: "+rat,Toast.LENGTH_SHORT).show();
        cerrar();
    }
    public void cerrar(){
        float rat=calificacion.getRating();
        if(rat==4){
            finish();
        }
    }
}
