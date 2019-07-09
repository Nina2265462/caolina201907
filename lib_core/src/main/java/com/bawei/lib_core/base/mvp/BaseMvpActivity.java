package com.bawei.lib_core.base.mvp;

import com.bawei.lib_core.base.BaseActivity;

/*
 *@Auther:cln
 *@Date: 2019/7/9
 *@Description:功能
 * */
public abstract class BaseMvpActivity<M extends BaseModel, P extends BasePresenter>
        extends BaseActivity implements BaseView {

    public M model;
    public P presenter;

    @Override
    protected void initData() {

        presenter = (P) initPresenter();
        if (presenter != null) {
            model = (M) presenter.getModel();
            if (model != null) {
                presenter.attach(model, this);
            }
        }

        initDatas();


    }

    protected abstract void initDatas();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
        }
    }
}
