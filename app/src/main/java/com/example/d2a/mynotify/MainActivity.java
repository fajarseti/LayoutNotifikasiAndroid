package com.example.d2a.mynotify;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        NotificationManagerCompat myManager = NotificationManagerCompat.from(this);

        NotificationCompat.Builder myNotif = new NotificationCompat.Builder(this);

        myNotif.setContentTitle("You Have a New Notification");
        myNotif.setContentText("Halo Coeg");
        myNotif.setSmallIcon(android.R.drawable.ic_dialog_info);

        Intent i1 = new Intent(this,MainActivity.class);
        PendingIntent p1 = PendingIntent.getActivity(this,1,i1,0);
        myNotif.setContentIntent(p1);
        myNotif.setAutoCancel(true);

        myManager.notify(1,myNotif.build());
        finish();

    }
}
