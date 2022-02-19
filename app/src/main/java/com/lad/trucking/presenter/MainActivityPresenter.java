package com.lad.trucking.presenter;

public interface MainActivityPresenter {

    void calcularViajes(String c,String f); // interatir

    void showError(String error); // view

    void showResult(String resultado, String totalViaje);// view

}
