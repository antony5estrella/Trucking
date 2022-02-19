package com.lad.trucking.interactor;

import com.lad.trucking.presenter.MainActivityPresenter;

public class MainActivityInteractorInpl implements MainActivityInterator {

    private MainActivityPresenter presenter;

    public MainActivityInteractorInpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void calcularViajes(String c, String f) {
        int resultado = (Integer.parseInt(c)*150)+(Integer.parseInt(f)*150);
        int totalViajes = Integer.parseInt(c)+Integer.parseInt(f);
        presenter.showResult(String.valueOf(resultado),String.valueOf(totalViajes));

    }
}
