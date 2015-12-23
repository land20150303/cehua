package com.unit.unit_cehua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lidroid.xutils.ViewUtils;

/**
 * Created by tao on 15-12-23.
 */
public class SearchMainFragment extends Fragment implements View.OnClickListener{

    private MainActivity activity;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = (MainActivity) SearchMainFragment.this.getActivity();
        View rootView = View.inflate(activity.getApplication(), R.layout.fra_search_main, null);
        ViewUtils.inject(this, rootView);

        button = (Button) rootView.findViewById(R.id.openceBtn);
        button.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.openceBtn:
                activity.openedOrClosedSlide();
                break;

        }
    }
}
