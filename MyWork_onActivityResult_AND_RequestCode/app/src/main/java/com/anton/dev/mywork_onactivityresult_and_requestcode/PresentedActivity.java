package com.anton.dev.mywork_onactivityresult_and_requestcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PresentedActivity extends Activity {
    private EditText editName;
    private Button btngoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_activity);
        editName = (EditText) findViewById(R.id.edt_putName);
        btngoBack = (Button) findViewById(R.id.btn_goBack);
    }

    public void typeName(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", editName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
