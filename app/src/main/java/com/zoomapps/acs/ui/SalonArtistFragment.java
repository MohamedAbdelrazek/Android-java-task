package com.zoomapps.acs.ui;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zoomapps.acs.R;
import com.zoomapps.acs.data.response.artistResponse.ArtistResponse;
import com.zoomapps.acs.di.AppComponent;
import com.zoomapps.acs.util.MyApplication;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

public class SalonArtistFragment extends DialogFragment {

    public SalonArtistFragment() {
        // Required empty public constructor
    }

    @Named("salonViewModel")
    @Inject
    ViewModelProvider.Factory factory;

    @BindView(R.id.artists_recyclerView)
    RecyclerView recyclerView;
    private SalonViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_salon_artist, container, false);
        ButterKnife.bind(this, view);
        AppComponent mAppComponent = ((MyApplication) getActivity().getApplication()).appComponent;
        mAppComponent.inject(this);
        initDialog();
        viewModel = ViewModelProviders.of(this, factory).get(SalonViewModel.class);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        view.findViewById(R.id.close).setOnClickListener(v -> {
            this.dismiss();
        });
        return view;
    }

    private void initDialog() {
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel.getArtist(35).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<ArtistResponse>() {
            @Override
            public void accept(ArtistResponse artistResponse) {
                ArtistAdapter artistAdapter = new ArtistAdapter(artistResponse.getData());
                recyclerView.setAdapter(artistAdapter);

            }
        }, throwable -> Log.i("tag", "Throwable: " + throwable.getMessage()));
    }

}
