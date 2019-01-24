package me.aflak.dagger.model;

import javax.inject.Inject;

public class User {
    private String name;

    @Inject
    public User() {
        this.name = "test";
    }
}
