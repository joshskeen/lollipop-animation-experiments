package com.joshskeen.lollipopanimation;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfigOptions configOptions = new ConfigOptions(ConfigOptions.Example.VECTOR_ANIMATION);
        startActivity(ExampleActivity.newIntent(MainActivity.this, configOptions));
    }

}
