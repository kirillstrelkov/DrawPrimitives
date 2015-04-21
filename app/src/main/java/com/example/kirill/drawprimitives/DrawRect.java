package com.example.kirill.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by kirill on 21.04.15.
 */
public class DrawRect extends DrawCanvas {


    public DrawRect(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.RED);
        canvas.drawRect(10, 30, 450, 300, paint);
    }
}
