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

        EditText c =(EditText)findViewById(R.id.editTextCentral);
        EditText f =(EditText)findViewById(R.id.editTextForge);

        central=Integer.parseInt(c.getText().toString());
        forge=Integer.parseInt(f.getText().toString());
    }
    public void calcular(View vista){
        //---llamada al metodo--
        obtenerValores();
        //-- calculos--
        resultado= (central*75)+(forge*65);

        totalCargas= central+forge;
        //---llamada al metodo---
        mostrarResultado();
    }
    public void mostrarResultado(){
        TextView texto  =(TextView)findViewById(R.id.textViewResultadoCalculo);

        texto.setText("Pago $:" + resultado);

        TextView textoCantidadCarga =(TextView)findViewById(R.id.textViewCantidadCarga);
        textoCantidadCarga.setText("Total cargas: "+ totalCargas);

    }

}
