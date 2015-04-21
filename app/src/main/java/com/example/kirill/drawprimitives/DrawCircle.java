package com.example.kirill.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by kirill on 21.04.15.
 */
public class DrawCircle extends DrawCanvas {
    public DrawCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(700, 700, 200, paint);
    }
}
