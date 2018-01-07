package com.deepindex.ballbang;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.LinearInterpolator;

import com.deepindex.ballbang.view.BigBallView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BigBallView image = (BigBallView) findViewById(R.id.ballview);
        ObjectAnimator animator = ObjectAnimator.ofFloat(
                image, "rotation", 0f, 360f);
        animator.setDuration(3600);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.w("MainActivity", "getAnimatedValue: " + animation.getAnimatedValue());

            }
        });
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();
    }
}
