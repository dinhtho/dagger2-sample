package me.aflak.dagger.other_activity;

import dagger.Component;
import me.aflak.dagger.application.ApplicationComponent;
import me.aflak.dagger.scope.ActivityScope;

/**
 * Created by tho nguyen on 2019-06-01.
 */
@ActivityScope
@Component(modules = OtherActivityModule.class, dependencies = ApplicationComponent.class)
interface OtherActivityComponent {
    void inject(OtherActivity activity);
}
