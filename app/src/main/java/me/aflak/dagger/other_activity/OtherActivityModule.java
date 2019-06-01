package me.aflak.dagger.other_activity;

import dagger.Module;
import dagger.Provides;
import me.aflak.dagger.model.TestData;
import me.aflak.dagger.scope.ActivityScope;

/**
 * Created by tho nguyen on 2019-06-01.
 */

@Module
public class OtherActivityModule {
    @Provides
    @ActivityScope
    TestData provideTestData() {
        return new TestData("activity module");
    }
}
