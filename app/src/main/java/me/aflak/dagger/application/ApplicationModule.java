package me.aflak.dagger.application;

import android.content.Context;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aflak.dagger.model.ImageDownloader;
import me.aflak.dagger.model.TestData;
import me.aflak.dagger.model.User;
import me.aflak.dagger.scope.ActivityScope;
import me.aflak.dagger.scope.ApplicationScope;

@Module
public class ApplicationModule {
    private Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }


    @Provides
    @ApplicationScope
    Context provideContext() {
        return context;
    }
}
