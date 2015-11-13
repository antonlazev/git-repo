package com.anton.dev.mywork_radiobutton_and_radiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut_Dev;
    private RadioGroup rd_Group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut_Dev = (TextView)findViewById(R.id.tvOut_Dev);
        rd_Group = (RadioGroup)findViewById(R.id.rd_Group);
        rd_Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdBut_Green:
                        tvOut_Dev.setTextColor(Color.GREEN);
                        break;
                    case R.id.rdBut_Red:
                        tvOut_Dev.setTextColor(Color.RED);
                        break;
                    case R.id.rdBut_Black:
                        tvOut_Dev.setTextColor(Color.BLACK);
                        break;
                }
            }
        });
    }

}
