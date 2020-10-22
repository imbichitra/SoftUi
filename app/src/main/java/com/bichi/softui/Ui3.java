package com.bichi.softui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

public class Ui3 extends AppCompatActivity {
    NeomorphFrameLayout btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui3);
        btn = findViewById(R.id.layout_login_btn);


    }

    public void click(View view) {
        //btn.setShadowNone();
    }
}