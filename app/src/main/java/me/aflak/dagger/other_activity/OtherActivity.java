package me.aflak.dagger.other_activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import me.aflak.dagger.R;
import me.aflak.dagger.activity.ActivityModule;
import me.aflak.dagger.application.MyApp;
import me.aflak.dagger.model.TestData;

public class OtherActivity extends AppCompatActivity {
    private final String TAG = "OtherActivity";
    @Inject
    TestData testData;
    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        DaggerOtherActivityComponent.builder()
                .applicationComponent(MyApp.app().getApplicationComponent())
                .build()
                .inject(this);

        Log.d(TAG, "onCreate: " + testData.getString());
    }
}
