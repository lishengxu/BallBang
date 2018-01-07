package com.deepindex.ballbang.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lsx on 18-1-7.
 */

public class SmallBallView extends View {
    private Paint mPaint;

    public SmallBallView(Context context) {
        this(context, null);
    }

    public SmallBallView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SmallBallView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, getWidth() / 2, mPaint);
        super.onDraw(canvas);
    }
}
