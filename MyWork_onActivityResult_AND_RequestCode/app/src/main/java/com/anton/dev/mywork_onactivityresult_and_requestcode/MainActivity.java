package com.anton.dev.mywork_onactivityresult_and_requestcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.anton.dev.mywork_onactivityresult_and_requestcode.Utils.RequestCode;

public class MainActivity extends Activity {
    private TextView txt_Name;
    private TextView txt_Language;
    private Button btnPresented;
    private Button btnLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_Name = (TextView) findViewById(R.id.tvOut_Name);
        txt_Language = (TextView) findViewById(R.id.tvOut_Language);
        btnPresented = (Button) findViewById(R.id.btn_Presented);
        btnLanguage = (Button) findViewById(R.id.btn_language);
        btnPresented.setOnClickListener(choiseBTN);
        btnLanguage.setOnClickListener(choiseBTN);
    }

    View.OnClickListener choiseBTN = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.btn_Presented:
                    intent = new Intent(MainActivity.this, PresentedActivity.class);
                    startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                    break;
                case R.id.btn_language:
                    intent = new Intent(MainActivity.this, LanguageActivity.class);
                    startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                    break;
            }
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==RESULT_OK){
            switch (requestCode){
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    txt_Name.setText("О-о-о привет, " + name);
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    txt_Language.setText("Твой язык, " +language);
            }
        }else{
            Toast.makeText(this,"Бляяя чувак не тупи",Toast.LENGTH_SHORT).show();

        }
    }
}