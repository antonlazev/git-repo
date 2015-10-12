package com.anton.dev.mywork_alertdialog_list;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }
}
