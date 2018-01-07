package com.deepindex.ballbang.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lsx on 18-1-8.
 */

public class BigBallView extends View {

    private Paint mPaint;

    public BigBallView(Context context) {
        this(context, null);
    }

    public BigBallView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BigBallView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
