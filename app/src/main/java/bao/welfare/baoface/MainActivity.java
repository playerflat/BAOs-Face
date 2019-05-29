package bao.welfare.baoface;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView view = findViewById(R.id.mouse);
        Bitmap thumb = ThumbnailUtils.createVideoThumbnail("file path/url", MediaStore.Images.Thumbnails.MINI_KIND);

        
    }
}
