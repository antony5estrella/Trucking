package com.lad.trucking.conteo.presenter;

public interface ConteoPresenter {
    void guardarViaje(String fecha,String origen); // Interactor
    void guardarViajeSuccess();
    void guardarViajeError(String error);
}
