package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dongtu.sdk.constant.DTGender;
import com.dongtu.store.DongtuStore;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        DongtuStore.initConfig(this, "323f5a22c8d94be8a770d8f803c2446d", "dc6f8f1281c248babdd362cf45d798c3");
        DongtuStore.setUserInfo("123", "123", DTGender.MALE, "!231", "231@qq.ocm", "17855840069", null);
        DongtuStore.load();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DongtuStore.destroy();
                Toast.makeText(TestActivity.this,"已关闭",Toast.LENGTH_SHORT);
            }
        });
    }
}
