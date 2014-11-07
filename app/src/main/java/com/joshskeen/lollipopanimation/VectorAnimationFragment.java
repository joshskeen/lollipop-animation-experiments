package com.joshskeen.lollipopanimation;

import android.app.Fragment;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class VectorAnimationFragment extends Fragment {

    @InjectView(R.id.mImageView)
    ImageView mImageView;

    private AnimatedVectorDrawable mVectorDrawable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_vector_animation, container, false);
        ButterKnife.inject(this, inflate);
        mVectorDrawable = (AnimatedVectorDrawable) mImageView.getBackground();
        mImageView.setOnClickListener(v -> mVectorDrawable.start());


        return inflate;
    }


}
