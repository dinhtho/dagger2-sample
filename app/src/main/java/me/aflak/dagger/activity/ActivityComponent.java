package me.aflak.dagger.activity;

import dagger.Component;
import me.aflak.dagger.application.ApplicationComponent;
import me.aflak.dagger.scope.ActivityScope;

/**
 * Created by Omar on 04/06/2016.
 */
@ActivityScope
@Component (dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

}
