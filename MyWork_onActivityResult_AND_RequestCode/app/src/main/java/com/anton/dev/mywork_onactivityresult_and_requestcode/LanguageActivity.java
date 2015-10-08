package com.anton.dev.mywork_onactivityresult_and_requestcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anton.dev.mywork_onactivityresult_and_requestcode.Utils.Language;

public class LanguageActivity extends Activity {
    private Button btn_English;
    private Button btn_Rus;
    private Button btn_Ukraine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_activity);
        btn_English = (Button)findViewById(R.id.btn_English);
        btn_Rus = (Button)findViewById(R.id.btn_Rus);
        btn_Ukraine = (Button)findViewById(R.id.btn_Ukraine);
        btn_English.setOnClickListener(setLang);
        btn_Rus.setOnClickListener(setLang);
        btn_Ukraine.setOnClickListener(setLang);
    }
    View.OnClickListener setLang = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()){
                case R.id.btn_English:
                    intent.putExtra("language", Language.ENGLISH.getLanguage().toString());
                    setResult(RESULT_OK, intent);
                    finish();
                    break;
                case R.id.btn_Rus:
                    intent.putExtra("language", Language.RUSSIAN.getLanguage().toString());
                    setResult(RESULT_OK, intent);
                    finish();
                    break;
                case R.id.btn_Ukraine:
                    intent.putExtra("language", Language.UKRAINE.getLanguage().toString());
                    setResult(RESULT_OK,intent);
                    finish();
                    break;
            }
        }
    };
}
