package bao.welfare.baoface;


import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import bao.welfare.baoface.bluetooth.Bluetooth;
import bao.welfare.baoface.face.Detect;
import bao.welfare.baoface.face.FaceHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView eyes = (ImageView)findViewById(R.id.eye);
        ImageView mouse =(ImageView)findViewById(R.id.s_mouse);
        TextView emotion = (TextView)findViewById(R.id.emotion);
        Bluetooth bluetooth =Bluetooth.getInstance(this);
        //FaceHandler handler = new FaceHandler(eyes);
        Handler handler = new FaceHandler(eyes,emotion,mouse);
        new Detect(handler);




    }
}
