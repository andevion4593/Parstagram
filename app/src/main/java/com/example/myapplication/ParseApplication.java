package com.example.myapplication;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xqCHYd43vf1CVAlH8l28iY02MzAKRI6bxypyztsx")
                .clientKey("Vmxlz4rg5APc4jPBU7bP8j1vPvzwFp8kTuK00ihE")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}