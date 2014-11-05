package com.joshskeen.lollipopanimation;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.myAnimation);
        AnimatedVectorDrawable vectorDrawable= (AnimatedVectorDrawable) imageView.getBackground();
        vectorDrawable.start();
    }

}
