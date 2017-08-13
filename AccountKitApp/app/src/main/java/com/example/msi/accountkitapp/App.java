package com.example.msi.accountkitapp;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;

import com.facebook.accountkit.AccountKit;

//import com.google.firebase.FirebaseApp;

/**
 * Created by M.S.I on 8/6/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        FirebaseApp.initializeApp(this);

        AccountKit.initialize(this, new AccountKit.InitializeCallback() {
            @Override
            public void onInitialized() {

            }
        });

    }
}
