package com.hyeran.android.samplepushpush;

import android.graphics.Color;
import android.graphics.Paint;

public class Map {
    private Paint paint;
    private Paint paint1;
    private Paint paint2;
    private int map[][] = {
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,1,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,2,0,0,},
            {0,0,0,0,0,0,0,0,0,0,},
    };

    public Map() {
        paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);    // 선의 두께

        paint1 = new Paint();
        paint1.setColor(Color.BLACK);

        paint2 = new Paint();
        paint2.setColor(Color.MAGENTA);
    }

    public int[][] get() {
        return map;
    }

    public int getCount() {
        return map[0].length;
    }

    public Paint getPaint() {
        return paint;
    }

    public Paint getPaint1() {
        return paint1;
    }

    public Paint getPaint2() {
        return paint2;
    }

    public int getCurrent(int y, int x) {
        return map[y][x];
    }

    public void setValue(int y, int x, int value) {
        map[y][x] = value;
    }
}
