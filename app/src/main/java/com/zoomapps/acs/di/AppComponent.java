package com.zoomapps.acs.di;

import com.zoomapps.acs.ui.SalonActivity;
import com.zoomapps.acs.ui.SalonArtistFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, ViewModelFactoryModule.class})
public interface AppComponent {

    void inject(SalonActivity salonActivity);

    void inject(SalonArtistFragment salonArtistFragment);
}
