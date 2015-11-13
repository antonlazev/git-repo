package com.anton.dev.mywork_alertdialog_checkbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);

    }

/*    public void alertD(View v) {
   *//*     final String[] phoneModels = getResources().getStringArray(R.array.phoneModels);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Hello")
                .setCancelable(false)
                .setSingleChoiceItems(phoneModels, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"kjkjdfkslj" + phoneModels[which],Toast.LENGTH_LONG).show();

                    }
                });
        AlertDialog alerttt = builder.create();
        builder.show();
    }
*/
        public void alertD (View v){
            final boolean[] check = {false, false, false, false, false};
            final String[] phomeModels = getResources().getStringArray(R.array.phoneModels);
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Ваш выбор?")
                    .setCancelable(false)
                    .setNegativeButton("Выйти", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();

                        }
                    });
            builder.setMultiChoiceItems(phomeModels, check, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    check[which] = isChecked;
                }
            });
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Вы выбрали, " + phomeModels[which], Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
            });
            AlertDialog alert = builder.create();
            builder.show();
        }

    }


