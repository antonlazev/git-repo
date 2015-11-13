package com.anton.dev.mywork_notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private NotificationManager nm;
    private static final int NOTIFY_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_Push = (Button)findViewById(R.id.btn_Push);
        nm = (NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);

    }
    public void showNotofication(View v){
        Intent intent = new Intent(getApplicationContext(),FinishActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        builder
        .setContentIntent(pendingIntent)
        .setSmallIcon(R.drawable.ic_launcher_email)
        .setLargeIcon(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ic_launcher_email))
        .setTicker("Notification")
        .setWhen(System.currentTimeMillis())
        .setAutoCancel(true)
        .setContentTitle("Что то пришло")
        .setContentText("Срочно");
        Notification notification = builder.build();
        nm.notify(NOTIFY_ID,notification);

    }
}
