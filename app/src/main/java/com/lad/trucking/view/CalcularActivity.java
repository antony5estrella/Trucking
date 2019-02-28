package com.lad.trucking.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.lad.trucking.R;
import com.lad.trucking.presenter.MainActivityPresenter;
import com.lad.trucking.presenter.MainActivityPresenterImpl;

public class CalcularActivity extends AppCompatActivity implements MainActivityView{

    private MainActivityPresenter presenter;
    public int central,forge,resultado,totalCargas;

    private EditText edtCentral;
    private EditText edtforge;
    private TextView textResultadoPagos;
    private TextView textTotalViajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

         presenter = new MainActivityPresenterImpl(this) ;

        edtCentral = findViewById(R.id.editTextCentral);
        edtforge= findViewById(R.id.editTextForge);
         textResultadoPagos = findViewById(R.id.textViewResultadoCalculo);
         textTotalViajes = findViewById(R.id.textViewCantidadCarga);

        /**
        central=0;
        forge=0;
        resultado=0;
        totalCargas=0;
        */
    }





    /*


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
    */

    public void calcularViajes(View view){
        String central = edtCentral.getText().toString();
        String forge = edtforge.getText().toString();
        presenter.calcularViajes(central,forge);
    }

    @Override
    public void showResult(String result,String totalViajes) {
        textResultadoPagos.setText("Pago:"+result);
        textTotalViajes.setText("Total viajes:"+totalViajes);
    }

    @Override
    public void showError(String error) {

    }
}
