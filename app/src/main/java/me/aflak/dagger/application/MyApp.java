package me.aflak.dagger.application;

import android.app.Application;

/**
 * Created by Omar on 04/06/2016.
 */
public class MyApp extends Application {
    private static MyApp app;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public static MyApp app(){
        return app;
    }

    public ApplicationComponent getApplicationComponent(){
        return this.applicationComponent;
    }

}
