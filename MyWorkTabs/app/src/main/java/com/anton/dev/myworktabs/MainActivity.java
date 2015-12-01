package com.anton.dev.myworktabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tab = (TabHost)findViewById(R.id.tabHost);
        /*Инициализация контейнера вкладок*/
        tab.setup();
    }
}
