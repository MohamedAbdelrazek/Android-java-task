package com.zoomapps.acs.di;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.zoomapps.acs.data.repo.UserRepo;
import com.zoomapps.acs.ui.SalonViewModel;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class ViewModelFactoryModule {

    @Named("salonViewModel")
    @Provides
    public ViewModelProvider.Factory provideFactory(UserRepo userRepo) {
        return new ViewModelProvider.Factory() {

            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return (T) new SalonViewModel(userRepo);
            }

        };
    }
}
