package com.lad.trucking.conteo.repository;

import com.lad.trucking.conteo.presenter.ConteoPresenter;

public class ConteoRepositoryInpl implements ConteoRepository {
    ConteoPresenter presenter;

    public ConteoRepositoryInpl(ConteoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void guardarViaje(String fecha, String origen) {
        boolean succes = false;
        if (succes){
            presenter.guardarViajeSuccess();
        }else {
            presenter.guardarViajeError("ocurrio un Error");
        }
    }
}
