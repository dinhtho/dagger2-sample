package me.aflak.dagger.activity;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aflak.dagger.model.ImageDownloader;
import me.aflak.dagger.model.User;
import me.aflak.dagger.scope.ActivityScope;
import me.aflak.dagger.scope.ApplicationScope;

/**
 * Created by Omar on 04/06/2016.
 */
@Module
public class ActivityModule {
    @Provides
    @ActivityScope
    ImageDownloader provideImageDownloader(Context context) {
        return new ImageDownloader(context);
    }
}
