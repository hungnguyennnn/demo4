package com.example.demo4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Demo43Adapter extends FragmentPagerAdapter {
    final List<Fragment> fragmentList = new ArrayList<>();
    final List<String> fragmentTitle = new ArrayList<>();

    public Demo43Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    //phương thức laysas title
    @NonNull
    @Override
    public CharSequence getPageTitle(int pos){
        return fragmentList.get(pos);
    }

    public void addFrag(Fragment fragment ,String title){
        fragmentList.add(fragment);
        fragmentList.add(title);
    }
}
