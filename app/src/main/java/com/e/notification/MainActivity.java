package com.e.notification;

import android.content.BroadcastReceiver;
import android.os.StrictMode;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;
    NotificationManagerCompat notificationManagerCompat;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        
        notificationManagerCompat=notificationManagerCompat.from(this);
        
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });
    }

    private void DisplayNotification() {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this, "Channel1")
                .setSmallIcon(R.drawable.ic_wifi_black_24dp)
                .setContentTitle("First Message")
                .setContentText("This is first Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1,builder.build());
    }

    private void DisplayNotification2() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Channel2")
                .setSmallIcon(R.drawable.ic_wifi_black_24dp)
                .setContentTitle("Second Message")
                .setContentText("This is Second Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);


        notificationManagerCompat.notify(2, builder.build());

    }


}
