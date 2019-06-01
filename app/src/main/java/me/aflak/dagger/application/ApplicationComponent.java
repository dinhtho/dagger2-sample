package me.aflak.dagger.application;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import me.aflak.dagger.model.ImageDownloader;
import me.aflak.dagger.model.TestData;
import me.aflak.dagger.scope.ApplicationScope;

@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Context context();
}