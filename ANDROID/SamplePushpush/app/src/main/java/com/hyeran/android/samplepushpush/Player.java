package com.hyeran.android.samplepushpush;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Player {
    private Paint paint;
    private int x, y;
    private float unit;

    public Player() {
        paint = new Paint();
        paint.setColor(Color.RED);
        x = 0;
        y = 0;
    }

    public void setUnit(float unit) {
        this.unit = unit;
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(
                x*unit+unit/2,
                y*unit+unit/2,
                unit/2,
                paint);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void up() {
        y--;
    }

    public void down() {
        y++;
    }

    public void left() {
        x--;
    }

    public void right() {
        x++;
    }
}
