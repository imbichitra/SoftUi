package com.bichi.softui.material;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class LoginAdapter extends FragmentStatePagerAdapter {

    private Context context;
    private int totalPage;
    public LoginAdapter(@NonNull FragmentManager fm, Context context,int totalPage) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
        this.totalPage = totalPage;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginFragment();
            case 1:
                return new SignupFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalPage;
    }
}
