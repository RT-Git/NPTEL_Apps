package com.wordpress.obliviouscode.majortestapp;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends IntentService {

    public MyService() {
        super("MyService"); //This is the name for the worker thread.
    }


    @Override
    protected void onHandleIntent(Intent intent)
    {
        try
        {
            Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
            Thread.sleep(5000);
            Toast.makeText(this, "After 5 sec", Toast.LENGTH_SHORT).show();
            stopSelf();
        }
        catch (InterruptedException r)
        {
            Thread.currentThread().interrupt();
        }
    }
}
