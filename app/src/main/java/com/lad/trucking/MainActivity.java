package com.lad.trucking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //----action var icono ----
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void pantallaHistorial(View view){
        Intent historial = new Intent(this, HistorialActivity.class);
        startActivity(historial);

    }

    public void pantallaDiario(View view){
        Intent diario = new Intent(this, DiarioActivity.class);
        startActivity(diario);

    }

    public void pantallaCalcular(View view){
        Intent calcular = new Intent(this, CalcularActivity.class);
        startActivity(calcular);

    }
}
