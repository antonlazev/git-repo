package com.anton.dev.mywork_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
   /* Стандартный пример ListView с массивом данных*/
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        final String [] models = getResources().getStringArray(R.array.myModels);
        final ArrayAdapter<String> listadapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,models);
        listView.setAdapter(listadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,((TextView)).getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

}

