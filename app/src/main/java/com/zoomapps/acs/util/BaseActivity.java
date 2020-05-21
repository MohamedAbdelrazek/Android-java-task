package com.zoomapps.acs.util;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.zoomapps.acs.R;
import com.zoomapps.acs.di.AppComponent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity  extends AppCompatActivity {
    public AppComponent mAppComponent;
    public ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppComponent = ((MyApplication) getApplication()).appComponent;
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setMessage(getString(R.string.please_wait_str));
    }
}
