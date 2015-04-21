package com.example.kirill.drawprimitives;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showRect(View view) {
        Intent intent = new Intent(this, RectActivity.class);
        startActivity(intent);
    }

    public void showLine(View view) {
        Intent intent = new Intent(this, LineActivity.class);
        startActivity(intent);
    }

    public void showCircle(View view) {
        Intent intent = new Intent(this, CircleActivity.class);
        startActivity(intent);
    }
}
