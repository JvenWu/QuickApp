package com.example.quickapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        pressBack2MiniApp(this);
    }

    public static void pressBack2MiniApp(Activity activity) {
        activity.moveTaskToBack(true);
    }
}
