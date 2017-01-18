package com.github.bigexcalibur.herovideo.mvp.home.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.github.bigexcalibur.herovideo.R;
import com.github.bigexcalibur.herovideo.mvp.test.ui.Test2Fragment;
import com.github.bigexcalibur.herovideo.mvp.test.ui.TestFragment;


/**
 * Created by hcc on 16/8/4 14:12
 * 100332338@qq.com
 * <p/>
 * 主界面Fragment模块Adapter
 */
public class HomePagerAdapter extends FragmentPagerAdapter {

    private final String[] TITLES;

    private Fragment[] fragments;

    public HomePagerAdapter(FragmentManager fm, Context context) {

        super(fm);
        TITLES = context.getResources().getStringArray(R.array.sections);
        fragments = new Fragment[TITLES.length];
    }

    @Override
    public Fragment getItem(int position) {

        if (fragments[position] == null) {
            switch (position) {

                case 0:
                    fragments[position] = new TestFragment();
                    break;
                case 1:
                    fragments[position] = new Test2Fragment();
                    break;
                case 2:
                    fragments[position] = new TestFragment();
                    break;
                case 3:
                    fragments[position] = new TestFragment();
                    break;
                case 4:
                    fragments[position] = new TestFragment();
                    break;
                case 5:
                    fragments[position] = new TestFragment();
                    break;
                default:
                    break;
            }
        }


        return fragments[position];
    }

    @Override
    public int getCount() {

        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return TITLES[position];
    }
}
