package com.e.notification;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.BroadcastReciverExample;

public class BroadCast extends AppCompatActivity {
    BroadcastReciverExample broadcastReciverExample=new BroadcastReciverExample();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast2);
    }

    protected void onStart() {

        super.onStart();

        IntentFilter intentFilter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReciverExample,intentFilter);
    }

    protected void onStop(){
        super.onStop();

        unregisterReceiver(broadcastReciverExample);
    }

}
