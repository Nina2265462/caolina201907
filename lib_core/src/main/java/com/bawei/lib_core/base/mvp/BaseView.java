package com.bawei.lib_core.base.mvp;

/*
 *@Auther:cln
 *@Date: 2019/7/9
 *@Description:功能
 * */
public interface BaseView {

    BasePresenter initPresenter();

    void showProgress();
    void hideProgress();
    void error(String msg);
}
