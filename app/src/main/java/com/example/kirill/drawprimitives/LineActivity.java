package com.example.kirill.drawprimitives;

import android.app.Activity;
import android.os.Bundle;


public class LineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawLine(this));
    }

}
