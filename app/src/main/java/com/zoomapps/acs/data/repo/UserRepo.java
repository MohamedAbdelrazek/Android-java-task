package com.zoomapps.acs.data.repo;

import android.content.SharedPreferences;

import com.zoomapps.acs.data.network.ApiClient;
import com.zoomapps.acs.data.response.artistResponse.ArtistResponse;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class UserRepo {
    private ApiClient apiClient;


    @Inject
    public UserRepo(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Observable<ArtistResponse> getArtist(int storeId) {
        return apiClient.getArtist("en", storeId).subscribeOn(Schedulers.io());
    }

}
