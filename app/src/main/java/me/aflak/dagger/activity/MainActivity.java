package me.aflak.dagger.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import javax.inject.Inject;

import me.aflak.dagger.R;
import me.aflak.dagger.application.MyApp;
import me.aflak.dagger.model.ImageDownloader;
import me.aflak.dagger.model.User;
import me.aflak.dagger.other_activity.OtherActivity;

public class MainActivity extends AppCompatActivity {
    @Inject
    ImageDownloader downloader;
    @Inject
    User user;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder()
                .applicationComponent(MyApp.app().getApplicationComponent())
                .activityModule(new ActivityModule())
                .build()
                .inject(this);
        Log.i(TAG, "onCreate: " + user);

        ImageView imageView = findViewById(R.id.main_image);
        downloader.toImageView(imageView, "http://s2.quickmeme.com/img/a6/a69d84379a04cc6f56a58c1c9b8d0826ddd24c9e52644ac7a068705a7be1a6bb.jpg");

        imageView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, OtherActivity.class));
        });
    }
}