package com.example.broadreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public static final String ACTION = "com.example.broadreceiverdemo.intent.action.MyReceiver";
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("接收到了消息,消息的类容是：" + intent.getStringExtra("data"));
        abortBroadcast();
    }
}
