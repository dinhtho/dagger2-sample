package me.aflak.dagger.model;

/**
 * Created by tho nguyen on 2019-06-01.
 */
public class TestData {
    private String string;

    public TestData(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
