package com.bawei.caolina201907.ui;

import android.widget.TextView;

import com.bawei.caolina201907.R;
import com.bawei.caolina201907.contract.HomeContract;
import com.bawei.caolina201907.model.HomeModel;
import com.bawei.caolina201907.presenter.HomePresenter;
import com.bawei.lib_core.base.mvp.BaseMvpActivity;
import com.bawei.lib_core.base.mvp.BasePresenter;

import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<HomeModel, HomePresenter> implements HomeContract.IHomeView {
    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void sucess(String result) {

    }

    @Override
    protected void initDatas() {
        tv.setText("哈哈哈哈");
        presenter.getHome();

    }

    @Override
    public BasePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void error(String msg) {

    }
}
