package com.zoomapps.acs.di;

import android.content.Context;

import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.zoomapps.acs.data.network.ApiClient;
import com.zoomapps.acs.util.Constants;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    Context context;

    public NetworkModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    OkHttpClient providesOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .addInterceptor(new ChuckerInterceptor(context))
                .build();
    }


    @Singleton
    @Provides
    Retrofit providesRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Constants.STORE_BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Singleton
    @Provides
    ApiClient providesApiClient(Retrofit retrofit) {
        return retrofit.create(ApiClient.class);
    }
}
