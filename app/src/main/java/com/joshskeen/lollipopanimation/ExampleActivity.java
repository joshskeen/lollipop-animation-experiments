package com.joshskeen.lollipopanimation;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;

public class ExampleActivity extends Activity {

    private static final String CONFIG_OPTIONS = "CONFIG_OPTIONS";
    private Intent mIntent;
    private ConfigOptions mConfigOptions;

    public static Intent newIntent(Context context, ConfigOptions options) {
        Intent intent = new Intent(context, ExampleActivity.class);
        intent.putExtra(CONFIG_OPTIONS, options);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState   ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        ButterKnife.inject(this);
        mConfigOptions = getConfigOptions();
        getFragmentManager().beginTransaction().replace(R.id.example_frame, createFragment()).commit();
    }

    private Fragment createFragment() {
        Fragment fragment = null;
        switch (mConfigOptions.mExample) {
            case VECTOR_ANIMATION:
                fragment = new VectorAnimationFragment();
                break;
        }
        return fragment;
    }

    private ConfigOptions getConfigOptions() {
        mIntent = getIntent();
        return (ConfigOptions) mIntent.getSerializableExtra(CONFIG_OPTIONS);
    }
}
