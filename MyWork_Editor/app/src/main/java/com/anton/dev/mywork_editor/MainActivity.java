package com.anton.dev.mywork_editor;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    private EditText mText;
    private float mTextsize = 18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (EditText) findViewById(R.id.edit_text);
        final Button r_button = (Button) findViewById(R.id.button_r);
        final Button b_button = (Button) findViewById(R.id.button_b);
        final Button i_button = (Button) findViewById(R.id.button_i);
        final Button plus_button = (Button) findViewById(R.id.button_plus);
        final Button minus_button = (Button) findViewById(R.id.button_minus);
        final Button reset_button = (Button)findViewById(R.id.res_button);
        r_button.setOnClickListener(this);
        b_button.setOnClickListener(this);
        plus_button.setOnClickListener(this);
        minus_button.setOnClickListener(this);
        reset_button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_r:
                mText.setTypeface(null, Typeface.BOLD_ITALIC);
                break;
            case R.id.button_b:
                mText.setTypeface(null,Typeface.BOLD);
                break;
            case R.id.button_i:
                mText.setTypeface(null,Typeface.ITALIC);
                break;
            case R.id.button_plus:
                if (mTextsize <= 72)
                    mTextsize+=2;
                mText.setTextSize(mTextsize);
                break;
            case R.id.button_minus:
                if(mTextsize>=20)
                    mTextsize-=2;
                mText.setTextSize(mTextsize);
                break;
            case R.id.res_button:
                if (mTextsize >= 18)
                    mTextsize=18;
                mText.setTextSize(mTextsize);
                mText.setTypeface(null, Typeface.NORMAL);
                break;







        }
    }
}





