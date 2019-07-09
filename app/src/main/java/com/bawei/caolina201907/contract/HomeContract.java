package com.bawei.caolina201907.contract;

import com.bawei.caolina201907.model.HomeModel;
import com.bawei.lib_core.base.mvp.BaseModel;
import com.bawei.lib_core.base.mvp.BasePresenter;
import com.bawei.lib_core.base.mvp.BaseView;

public interface HomeContract
{

     abstract class HomePresenter extends BasePresenter<IHomeModel,IHomeView> {
         @Override
         public IHomeModel getModel() {
             return new HomeModel();
         }

        public abstract void getHome();


    }

     interface  IHomeModel extends BaseModel {

         void getHome();

    }

     interface  IHomeView extends BaseView {

        void sucess(String result);


    }
}
