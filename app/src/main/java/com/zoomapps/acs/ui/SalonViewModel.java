package com.zoomapps.acs.ui;

import androidx.lifecycle.ViewModel;

import com.zoomapps.acs.data.repo.UserRepo;
import com.zoomapps.acs.data.response.artistResponse.ArtistResponse;

import io.reactivex.Observable;

public class SalonViewModel extends ViewModel {
    private UserRepo userRepo;

    public SalonViewModel(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Observable<ArtistResponse> getArtist(int storeId) {
        return userRepo.getArtist(storeId);
    }

}
