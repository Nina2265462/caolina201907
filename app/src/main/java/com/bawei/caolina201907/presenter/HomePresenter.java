package com.bawei.caolina201907.presenter;


import com.bawei.caolina201907.contract.HomeContract;

public class HomePresenter extends HomeContract.HomePresenter {
    @Override
    public void getHome() {

        model.getHome();

        view.sucess("");


    }
}
