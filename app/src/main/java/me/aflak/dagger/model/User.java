package me.aflak.dagger.model;

import android.content.Context;

import javax.inject.Inject;

public class User {
    private String name;
    private Context context;

    @Inject
    public User(Context context) {
        this.name = "test";
        this.context = context;
    }
}
