package com.example.kirill.drawprimitives;

import android.app.Activity;
import android.os.Bundle;


public class RectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawRect(this));
    }

}
