package com.anton.dev.myworkimagebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    private ImageButton mButton;
    private boolean mPlay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (ImageButton)findViewById(R.id.imageButton);
        mButton.setImageResource(R.drawable.play);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlay){
                    mButton.setImageResource(R.drawable.pause);
                }else{
                    mButton.setImageResource(R.drawable.play);
                }
                mPlay = !mPlay;
            }
        });

    }
}
