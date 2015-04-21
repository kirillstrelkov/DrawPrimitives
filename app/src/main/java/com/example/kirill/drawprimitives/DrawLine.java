package com.example.kirill.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by kirill on 21.04.15.
 */
public class DrawLine extends DrawCanvas {
    public DrawLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(30);
        canvas.drawLine(90, 750, 550, 600, paint);
    }
}
