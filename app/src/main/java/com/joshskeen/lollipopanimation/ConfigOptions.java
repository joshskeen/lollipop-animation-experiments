package com.joshskeen.lollipopanimation;

import java.io.Serializable;

public class ConfigOptions implements Serializable {

    public final Example mExample;

    enum Example {
        VECTOR_ANIMATION
    }

    public ConfigOptions(Example example) {
        mExample = example;
    }

}