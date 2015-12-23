package com.unit.unit_cehua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lidroid.xutils.ViewUtils;

/**
 * Created by tao on 15-12-23.
 */
public class SearchSlideFragment extends Fragment {

    private MainActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = (MainActivity) SearchSlideFragment.this.getActivity();
        View rootView = View.inflate(activity.getApplication(), R.layout.fra_search_slide, null);
        ViewUtils.inject(this, rootView);

        return rootView;
    }
}
