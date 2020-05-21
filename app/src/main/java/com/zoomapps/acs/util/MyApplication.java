package com.zoomapps.acs.util;

import android.app.Application;

import com.zoomapps.acs.di.AppComponent;
import com.zoomapps.acs.di.DaggerAppComponent;
import com.zoomapps.acs.di.NetworkModule;
import com.zoomapps.acs.di.ViewModelFactoryModule;


public class MyApplication extends Application {
    public AppComponent appComponent;
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().networkModule(new NetworkModule(this)).
                viewModelFactoryModule(new ViewModelFactoryModule()).build();

    }
}
