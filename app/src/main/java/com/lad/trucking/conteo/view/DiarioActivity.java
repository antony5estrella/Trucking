package com.lad.trucking.conteo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.lad.trucking.R;
import com.lad.trucking.conteo.presenter.ConteoPresenter;
import com.lad.trucking.conteo.presenter.ConteoPresenterImpl;

public class DiarioActivity extends AppCompatActivity implements ConteoView {

    private EditText fecha,origen;
    private Button botonGuardarViaje;
   // private ProgressBar progressBarConteo;
    private ConteoPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

        fecha =   findViewById(R.id.editTextFecha);
        origen =  findViewById(R.id.editTextOrigen);
        botonGuardarViaje = findViewById(R.id.buttonGuardarViaje);
       // progressBarConteo = findViewById(R.id.progressBarConteo);
       // hideProgressBar();
        presenter = new ConteoPresenterImpl(this);

        botonGuardarViaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (fecha.equals(""))
                presenter.guardarViaje(fecha.getText().toString(),origen.getText().toString());
            }
        });
    }


    @Override
    public void enableImputs() {
      fecha.setEnabled(true);
      origen.setEnabled(true);
      botonGuardarViaje.setEnabled(true);
    }

    @Override
    public void disableImputs() {
        fecha.setEnabled(false);
        origen.setEnabled(false);
        botonGuardarViaje.setEnabled(false);
    }

    @Override
    public void showProgressBar() {
      // progressBarConteo.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
      //progressBarConteo.setVisibility(View.GONE);
    }

    @Override
    public void conteoError(String error) {
        Toast.makeText(this,getString(R.string.error)+ error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void guardarViaje() {

    }


}



