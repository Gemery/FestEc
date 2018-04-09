package com.example.gemery.festec;

import android.app.Application;

import com.example.latte_core.app.Latte;

/**
 * Created by gemery on 2018/4/2.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
