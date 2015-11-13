package com.anton.dev.mywork_settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        switch (item.getItemId()){
            case R.id.action_abaut:
                intent = new Intent(this,AbautActivity.class);
                startActivity(intent);
                break;
            case R.id.action_settings:
                Toast.makeText(this,"Меню настроек пока не готово",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
