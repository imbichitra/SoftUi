package com.bichi.softui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

public class Ui2 extends AppCompatActivity {

    NeomorphFrameLayout b ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui2);
        b= findViewById(R.id.f);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setShadowInner();
            }
        });

    }
}