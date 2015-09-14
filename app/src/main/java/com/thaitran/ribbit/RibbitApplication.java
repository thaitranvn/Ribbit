package com.thaitran.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by thaitran on 9/14/15.
 */
public class RibbitApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "z8AL7OBJ2lK4uNHuecIWotHMH42B1618oMUHXpCT", "GfRmyuKbtaHVTdVEhWrbRe0rUSyBAqiF3vSnlQcV");


    }
}
