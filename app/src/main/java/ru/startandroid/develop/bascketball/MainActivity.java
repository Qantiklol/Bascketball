package ru.startandroid.develop.bascketball;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ball;
    MotionLayout motionLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = findViewById(R.id.ball);
        motionLayout = findViewById(R.id.motionLayout);

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                motionLayout.transitionToStart();

            }
        });
    }
}