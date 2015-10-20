package com.apkprovider.animatedcheckBox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.apkprovider.animatedcheckBox.customcheckbox.AnimatedCheckBox;


public class MainActivity extends AppCompatActivity implements AnimatedCheckBox.OnCheckedChangeListener{
    private AnimatedCheckBox mAnimCheckBox1, mAnimCheckBox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnimCheckBox1 = (AnimatedCheckBox)findViewById(R.id.checkbox_1);
        mAnimCheckBox1.setChecked(false, false);
        mAnimCheckBox2 = (AnimatedCheckBox)findViewById(R.id.checkbox_2);
        mAnimCheckBox2.setChecked(false, false);
        mAnimCheckBox1.setOnCheckedChangeListener(this);
        mAnimCheckBox2.setOnCheckedChangeListener(this);
    }


    @Override
    public void onChange(boolean checked) {
        Log.e("### MainActivity", "checked status:" + checked);
    }
}