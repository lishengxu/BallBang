package com.deepindex.ballbang;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView value = (TextView) findViewById(R.id.value);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        ObjectAnimator animator = ObjectAnimator.ofFloat(image, "rotation", 0f, 360f);
        animator.setDuration(5000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.start();

        ValueAnimator anim = ValueAnimator.ofFloat(0f, 1f);
        anim.setDuration(5000);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                value.setText(animation.getAnimatedValue() + "");
            }
        });
        anim.start();
        Log.w("MainActivity", "stack is ", new Exception("this is a log"));
    }
}
