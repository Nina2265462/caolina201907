package com.bawei.lib_core.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
 *@Auther:cln
 *@Date: 2019/7/9
 *@Description:功能
 * */
public abstract class BaseFragment extends Fragment {

    private View inflate;
    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        inflate = inflater.inflate(binLayout(), container, false);
        bind = ButterKnife.bind(this, inflate);
        return inflate;
    }

    /**
     * 布局
     * @return
     */
    protected abstract int binLayout();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            //用户可见
            requestNetData();
        }else{

            //false
        }
    }

    protected abstract void requestNetData();//供外部调用者访问
}
