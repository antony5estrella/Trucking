package com.lad.trucking.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lad.trucking.R;
import com.lad.trucking.conteo.view.DiarioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
