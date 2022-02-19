package com.lad.trucking.conteo.interactor;

import com.lad.trucking.conteo.presenter.ConteoPresenter;
import com.lad.trucking.conteo.repository.ConteoRepository;
import com.lad.trucking.conteo.repository.ConteoRepositoryInpl;

public class ConteoInteractorImpl implements ConteoInteractor {

    private ConteoPresenter presenter;
    private ConteoRepository repository;



    public ConteoInteractorImpl(ConteoPresenter presenter) {
       this.presenter = presenter;
       repository = new ConteoRepositoryInpl(presenter);
    }

    @Override
    public void guardarViaje(String fecha, String origen) {
      repository.guardarViaje(fecha,origen);
    }
}
