package com.unit.unit_cehua;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MainActivity extends AppCompatActivity implements DrawerLayout.DrawerListener {

    private DrawerLayout mDrawerLayout;

    @ViewInject(R.id.fl_search_slide_menu)
    private FrameLayout mSlideMenu;

    // 主界面
    private SearchMainFragment mSearchMainFragment;

    // 侧滑菜单界面
    private SearchSlideFragment mSearchSlideFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.search_drawer_layout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        mSearchMainFragment = new SearchMainFragment();
        fragmentTransaction.add(R.id.fl_search_main_menu, mSearchMainFragment);

        mSearchSlideFragment = new SearchSlideFragment();
        fragmentTransaction.add(R.id.fl_search_slide_menu, mSearchSlideFragment);

        fragmentTransaction.commit();
        mDrawerLayout.setFocusableInTouchMode(false);
        mDrawerLayout.setDrawerListener(this);


    }

    public void opence(View view){
        openedOrClosedSlide();
    }

    /**
     * 侧滑菜单打开或关闭
     */
    public void openedOrClosedSlide() {
        if (mDrawerLayout.isDrawerOpen(mSlideMenu)) {
            mDrawerLayout.closeDrawer(mSlideMenu);
        } else {
            mDrawerLayout.openDrawer(mSlideMenu);
        }

    }

    @Override
    public void onDrawerClosed(View arg0) {
    }

    @Override
    public void onDrawerOpened(View arg0) {
    }

    @Override
    public void onDrawerSlide(View arg0, float arg1) {
    }

    @Override
    public void onDrawerStateChanged(int arg0) {
    }

}
