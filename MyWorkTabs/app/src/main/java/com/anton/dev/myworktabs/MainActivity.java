package com.anton.dev.myworktabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {
    private TabHost tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = (TabHost) findViewById(R.id.tabhost);

        /*setup() — инициализирует контейнер вкладок.
        Необходимо вызывать перед добавлением вкладок,
        если TabHost загружается методом findViewById();*/
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("tag1");
        /*Первая вкладка*/
        spec.setContent(R.id.tabPage1);
        spec.setIndicator("Document 1");
        tabs.addTab(spec);

        /*Вторая вкладка*/
        spec = tabs.newTabSpec("tag2");
        spec.setContent(R.id.tabPage2);
        spec.setIndicator("Document 2");
        tabs.addTab(spec);

        /*Третья вкладка*/
        spec = tabs.newTabSpec("tag3");
        spec.setContent(R.id.tabPage3);
        spec.setIndicator("Document 3");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }
}
