package bao.welfare.baoface.face;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import bao.welfare.baoface.R;

public class FaceHandler extends Handler {
    private ImageView eyes;
    private ImageView mouse;
    private  TextView emotion;

    private int i=0;

    public FaceHandler(ImageView eyes, TextView emotion, ImageView mouse){
        this.eyes = eyes;
        this.mouse=mouse;
        this.emotion=emotion;

    }


    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        Log.d("핸들러 작동 테스트:","테스트중"+Eye.getEye().getEyeX()+" "+ Eye.getEye().getEyeY()+" ");

        emotion.setText(Eye.getEye().getFacialExpression());
        if(Eye.getEye().getEyeX()>0||Eye.getEye().getEyeY()>0){
            eyes.setX(Eye.getEye().getEyeX());
            eyes.setY((Eye.getEye().getEyeY()));

        }
        if(i==1){
            eyes.setImageResource(R.drawable.sad_eye);
            mouse.setImageResource(R.drawable.sad);

        }else if(i==2){
            eyes.setImageResource(R.drawable.oops_eye);
            mouse.setImageResource(R.drawable.smile);
        }else if(i==3){
            eyes.setImageResource(R.drawable.normal_eye);
            mouse.setImageResource(R.drawable.normal);


        }else if(i==4){


        }else if(i==5){


        }else if(i==6){
            i=0;
        }
        i++;


    }
}
