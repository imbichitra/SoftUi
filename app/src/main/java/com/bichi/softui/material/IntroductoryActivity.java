package com.bichi.softui.material;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.bichi.softui.R;

import org.jetbrains.annotations.NotNull;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView logo,appName,splashImage;
    LottieAnimationView lottieAnimationView;

    public static final int NUM_PAGES = 3;
    private ViewPager viewPager;
    private ScreenSlidePagerAdapter pagerAdapter;

    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImage = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        animation = AnimationUtils.loadAnimation(this,R.anim.o_b_anim);
        viewPager.startAnimation(animation);
        splashImage.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2100).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(2100).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2100).setDuration(1000).setStartDelay(4000);

    }

    private static class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NotNull
        @Override
        public Fragment getItem(int position) {
           switch (position){
               case 0:
                   return new OnBoardingFragment1();
               case 1:
                   return new OnBoardingFragment2();
               case 2:
                   return new OnBoardingFragment3();
           }
           return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}