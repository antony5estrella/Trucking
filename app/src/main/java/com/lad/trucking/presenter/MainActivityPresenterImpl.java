package com.lad.trucking.presenter;

import com.lad.trucking.interactor.MainActivityInteractorInpl;
import com.lad.trucking.interactor.MainActivityInterator;
import com.lad.trucking.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

        private MainActivityView activityView;
        private MainActivityInterator interator;

    public MainActivityPresenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interator = new MainActivityInteractorInpl(this);
    }

    @Override
    public void calcularViajes(String central, String forge) {
        interator.calcularViajes(central,forge);
    }

    @Override
    public void showError(String error) {
      activityView.showError(error);
    }

    @Override
    public void showResult(String resultado,String totalViajes) {
     activityView.showResult(resultado,totalViajes);

    }
}
