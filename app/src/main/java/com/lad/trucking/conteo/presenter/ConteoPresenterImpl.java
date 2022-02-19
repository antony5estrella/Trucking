package com.lad.trucking.conteo.presenter;

import android.widget.Toast;

import com.lad.trucking.conteo.interactor.ConteoInteractor;
import com.lad.trucking.conteo.interactor.ConteoInteractorImpl;
import com.lad.trucking.conteo.view.ConteoView;
import com.lad.trucking.conteo.view.DiarioActivity;

public class ConteoPresenterImpl implements ConteoPresenter {
    private ConteoView conteoView;
    private ConteoInteractor interactor;

    public ConteoPresenterImpl(ConteoView conteoView) {
        this.conteoView = conteoView;

        interactor = new ConteoInteractorImpl(this);

    }

    @Override
    public void guardarViaje(String fecha, String origen) {


        conteoView.disableImputs();
       // conteoView.showProgressBar();
        interactor.guardarViaje(fecha,origen);
    }

    @Override
    public void guardarViajeSuccess() {
      // conteoView.hideProgressBar();
       conteoView.enableImputs();

    }

    @Override
    public void guardarViajeError(String error) {
        conteoView.enableImputs();
        conteoView.hideProgressBar();
        conteoView.conteoError(error);
    }
}
