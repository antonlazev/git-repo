package com.anton.dev.myworkasynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ProgressBar mProgressbar;
    private TextView mTvoutProcent;
    private TextView mTvOutDev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar);
        mTvoutProcent = (TextView) findViewById(R.id.tvOutProcent);
        mTvOutDev = (TextView) findViewById(R.id.tvOut);
    }
    public void mAsyncBTN(View v){
        new MyProgresTaskAsync().execute();
    }

    class MyProgresTaskAsync extends AsyncTask<Void,Integer,Void>{
        private int mProgresBarValue = 0;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getApplicationContext(),"Процесс начат",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Toast.makeText(getApplicationContext(),"Процесс завершен",Toast.LENGTH_SHORT).show();
            mTvOutDev.setText("Отличная работа");
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            mProgressbar.setProgress(values[0]);
            mTvoutProcent.setText(values[0] + "%");
            super.onProgressUpdate(values);

        }

        @Override
        protected Void doInBackground(Void... params) {
            while (mProgresBarValue < 100){
                mProgresBarValue++;
                publishProgress(mProgresBarValue);
                SystemClock.sleep(100);
            }
            return null;
        }
    }
}