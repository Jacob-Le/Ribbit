package com.example.gaming.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Gaming on 8/10/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "76QT47TYRbLneTTBKyKxMfH2dVYgVwMNG6ysBjU2", "ruEOooj7r1hi9vi8Ys77BzwHT0mIfPRFGeYWvXCZ");


    }
}
