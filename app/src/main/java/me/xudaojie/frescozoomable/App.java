package me.xudaojie.frescozoomable;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by xdj on 2016/10/27.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
