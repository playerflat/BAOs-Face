package bao.welfare.baoface;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import bao.welfare.baoface.bluetooth.Bluetooth;
import bao.welfare.baoface.bluetooth.BluetoothActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        Handler BlinkHandler = new Handler();

        Intent intent= new Intent(getApplicationContext(),BluetoothActivity.class);
        startActivity(intent);


        Bluetooth bluetooth =Bluetooth.getInstance(this);


//        VideoView view = findViewById(R.id.mouse);
//        VideoView v = findViewById(R.id.eyes);
//        ImageView mouse = findViewById(R.id.s_mouse);
//
//        MediaController mediaController = new MediaController(MainActivity.this);
//       // mediaController.setVisibility(View.GONE);
//        view.setMediaController(mediaController);
//
//        view.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.speak));
//        view.bringToFront();
//        view.setOnCompletionListener(mediaPlayer->mouse.bringToFront());
//        view.start();

//
//        v.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.close));
//        v.bringToFront();
//        v.start();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try{
                        bluetooth.sendMessage("h2g2");
                    }catch (Exception e){


                    }


                }


            }
        });
        t.start();

    }
}
