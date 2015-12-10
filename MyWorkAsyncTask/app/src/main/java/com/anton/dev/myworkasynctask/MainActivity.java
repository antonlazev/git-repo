package com.anton.dev.myworkasynctask;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressBar mProgresbar;
    private TextView mtvOutProcent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgresbar = (ProgressBar)findViewById(R.id.progressBar);
        mtvOutProcent = (TextView)findViewById(R.id.tvOutProcent);
    }
    public void mAsyncBtn (View view){
        new MyWorkAsynctask().execute();
    }
    public class MyWorkAsynctask extends AsyncTask<Void, Integer,Void>{
        private int mProgresbarValue = 0;

        @Override
        //Метод вызывается в потоке пользовательского интерфейса в начале
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getApplicationContext(),"Начало процесcа",Toast.LENGTH_LONG).show();
        }

        @Override
        //Метод вызывается в потоке пользовательского интерфейса в конце
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Toast.makeText(getApplicationContext(),"Процесс завершен",Toast.LENGTH_LONG).show();

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            mProgresbar.setProgress(values[0]);
            mtvOutProcent.setText(values[0] + " % ");


        }

        @Override
        protected Void doInBackground(Void... params) {
            while (mProgresbarValue < 100){
                mProgresbarValue++;
                publishProgress(mProgresbarValue);
                SystemClock.sleep(200);
            }
            return null;
        }
    }
}
