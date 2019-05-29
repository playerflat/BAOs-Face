package bao.welfare.baoface;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import bao.welfare.baoface.bluetooth.BluetoothActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent= new Intent(getApplicationContext(),BluetoothActivity.class);
        startActivity(intent);
        VideoView view = findViewById(R.id.mouse);
        Bitmap thumb = ThumbnailUtils.createVideoThumbnail("file path/url", MediaStore.Images.Thumbnails.MINI_KIND);


    }
}
