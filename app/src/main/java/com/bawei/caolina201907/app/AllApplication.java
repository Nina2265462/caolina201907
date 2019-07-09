package com.bawei.caolina201907.app;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/*
 *@Auther:cln
 *@Date: 2019/7/9
 *@Description:功能
 * */
public class AllApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "12c078b22b", false);
    }
}
