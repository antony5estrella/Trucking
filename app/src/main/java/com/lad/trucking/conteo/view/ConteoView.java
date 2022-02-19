package com.lad.trucking.conteo.view;

public interface ConteoView {

    void enableImputs();
    void disableImputs();
    void showProgressBar();
    void hideProgressBar();

    void conteoError(String error);

    void guardarViaje();


}
