package com.zoomapps.acs.ui;

import android.os.Bundle;

import androidx.fragment.app.FragmentTransaction;

import com.zoomapps.acs.R;
import com.zoomapps.acs.data.repo.UserRepo;
import com.zoomapps.acs.util.BaseActivity;

import javax.inject.Inject;


public class SalonActivity extends BaseActivity {

    @Inject
    UserRepo userRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);
        mAppComponent.inject(this);
        findViewById(R.id.showArtists).setOnClickListener(v -> {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.addToBackStack(null);

            SalonArtistFragment dialogFragment = new SalonArtistFragment();
            dialogFragment.show(ft, "tag");
        });
    }
}
