package com.anton.dev.mywork_alertdialog_list;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button btn_Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Phone = (Button)findViewById(R.id.btn_cheak_phone);
    }
    public void pushBTN(View v){
        /*Создаем массив с моделя телефонов*/
        final String[] PHONES = {"IPHONE","NOKIA","SAMSUNG","HTC","MEIZU","ONE PLUS"};
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
        alertdialog.setTitle("Выберите модель телефона")
                .setIcon(R.drawable.ic_developer_mode_black_24dp)
                .setCancelable(false)
                /*Создаем на диалоге кнопку ОТМЕНЫ и закрытия диалога*/
                .setNeutralButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }

                });
        alertdialog.setSingleChoiceItems(PHONES, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Ваша модель телефона, " + PHONES[which],Toast.LENGTH_LONG).show();

            }
        });
        alertdialog.create();
        alertdialog.show();

    }
}
