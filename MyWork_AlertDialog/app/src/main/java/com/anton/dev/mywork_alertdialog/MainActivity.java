package com.anton.dev.mywork_alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button btnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertDialog = (Button)findViewById(R.id.btn_AlertDial);
        btnAlertDialog.setOnClickListener(goAlert);
    }
    View.OnClickListener goAlert = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder alerdialog = new AlertDialog.Builder(MainActivity.this);
            alerdialog.setIcon(R.drawable.ic_cloud_black_24dp);
            alerdialog.setTitle("Внимание");
            alerdialog.setMessage("Сохранить информацию?");
            alerdialog.setCancelable(false);
            alerdialog.setNegativeButton("НЕТ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case DialogInterface.BUTTON_NEGATIVE:
                            Toast.makeText(MainActivity.this, "Информация не сохранена", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            });
            alerdialog.setPositiveButton("ДА", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case DialogInterface.BUTTON_POSITIVE:
                            finish();
                            Toast.makeText(MainActivity.this,"Информация сохранена",Toast.LENGTH_LONG).show();
                            break;

                    }
                }
            });
            alerdialog.create();
            alerdialog.show();
        }
    };
}
