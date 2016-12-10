package com.wordpress.obliviouscode.majortestapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import java.net.URL;
import android.widget.ImageView;
import java.io.InputStream;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class saver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saver);
        final Context c = this;
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent in = new Intent(c,MyService.class);
//                startService(in);
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(c)
                                .setSmallIcon(R.drawable.ic_menu_camera)
                                .setContentTitle("My notification")
                                .setContentText("Hello World!");
                int mNotificationId = 001;
                mBuilder.setSound(Settings.System.DEFAULT_NOTIFICATION_URI);
// Gets an instance of the NotificationManager service
                NotificationManager mNotifyMgr =
                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
// Builds the notification and issues it.
                mNotifyMgr.notify(mNotificationId, mBuilder.build());
            }
        });

        l
        ImageView i = (ImageView) findViewById(R.id.imageView);
        Button d = (Button) findViewById(R.id.downb);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap b = loadImageFromNetwork("http://www.google.com/imgres?imgurl=http%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2F7%2F7a%2FBasketball.png&imgrefurl=http%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3ABasketball.png&h=340&w=340&tbnid=EJmjEDyJzrhAuM%3A&zoom=1&docid=C_hn8nOgsGmuwM&hl=en&ei=Q0o2U93LNcaIygH4mICQBQ&tbm=isch&ved=0CHwQhBwwBg&iact=rc&dur=3875&page=1&start=0&ndsp=14");
            }
        });

    }

}
