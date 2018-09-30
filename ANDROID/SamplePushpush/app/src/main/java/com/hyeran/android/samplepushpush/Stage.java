package com.hyeran.android.samplepushpush;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Stage extends View {
    Map map = null;
    Player player = null;

    float width;
    float height;
    int count = 0;
    float unit = 0;

    public Stage(Context context, float widthPixel) {
        super(context);
        this.width = widthPixel;

    }

    Paint tempPaint;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 맵 그리기
        if (map != null) {
            for (int y = 0; y < map.get().length; y++) {
                for (int x = 0; x < map.get().length; x++) {
                    int current = map.getCurrent(y, x);
                    switch (current) {
                        case 1:
                            tempPaint = map.getPaint1();
                            break;
                        case 2:
                            tempPaint = map.getPaint2();
                            break;
                        default:
                            tempPaint = map.getPaint();
                    }
                    canvas.drawRect(
                            x*unit,
                            y*unit,
                            x*unit+unit,
                            y*unit+unit,
                            tempPaint
                    );
                }
            }
        }
        // 플레이어 그리기
        if (player != null)
            player.onDraw(canvas);
    }

    public void up() {
        int next = map.getCurrent(player.getY()-1, player.getX());
        if(next == 1) {
            map.setValue(player.getY() - 1, player.getX(), 0);
            map.setValue(player.getY() - 2, player.getX(), 1);
        }

        player.up();
        invalidate();
    }

    public void down() {
        int next = map.getCurrent(player.getY()+1, player.getX());
        if(next == 1) {
            map.setValue(player.getY() + 1, player.getX(), 0);
            map.setValue(player.getY() + 2, player.getX(), 1);
        }

        player.down();
        invalidate();
    }

    public void left() {
        int next = map.getCurrent(player.getY(), player.getX()-1);
        if(next == 1) {
            map.setValue(player.getY(), player.getX() - 1, 0);
            map.setValue(player.getY(), player.getX() - 2, 1);
        }

        player.left();
        invalidate();
    }

    public void right() {
        int next = map.getCurrent(player.getY(), player.getX()+1);
        if(next == 1) {
            map.setValue(player.getY(), player.getX() + 1, 0);
            map.setValue(player.getY(), player.getX() + 2, 1);
        }

        player.right();
        invalidate();
    }

    public void addMap(Map map) {
        this.map = map;
        count = map.getCount();
        unit = width/count;
        invalidate();
    }

    public void addPlayer(Player player) {
        this.player = player;
        this.player.setUnit(unit);
        invalidate();
    }
}
