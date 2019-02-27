package com.lad.trucking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcularActivity extends AppCompatActivity {

    public int central,forge,resultado,totalCargas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);
        central=0;
        forge=0;
        resultado=0;
        totalCargas=0;

    }

    public void obtenerValores(){

        EditText c = findViewById(R.id.editTextCentral);
        EditText f = findViewById(R.id.editTextForge);

        central=Integer.parseInt(c.getText().toString());
        forge=Integer.parseInt(f.getText().toString());
    }
    public void calcular(View vista){
        //---llamada al metodo--
        obtenerValores();
        //-- calculos--
        resultado= (central*70)+(forge*60);

        totalCargas= central+forge;
        //---llamada al metodo---
        mostrarResultado();
    }
    public void mostrarResultado(){
        TextView texto  = findViewById(R.id.textViewResultadoCalculo);



        TextView textoCantidadCarga = findViewById(R.id.textViewCantidadCarga);

        texto.setText("Pago :" + resultado);
        textoCantidadCarga.setText("Total cargas :"+ totalCargas);

    }

}
