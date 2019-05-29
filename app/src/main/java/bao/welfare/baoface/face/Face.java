package bao.welfare.baoface.face;

import android.widget.VideoView;

/**
 * @author : Hyunwoong
 * @when : 5/27/2019 6:34 PM
 * @homepage : https://github.com/gusdnd852
 */

public class Face {
static Face face=null;
private VideoView eyes;
private VideoView mouse;


public Face getInstance(){
if(face==null){

    face = new Face();

}

return face;

}

private Face(){


}

    public void setEyes(VideoView eyes) {
        this.eyes = eyes;
    }

    public void setMouse(VideoView mouse) {
        this.mouse = mouse;
    }

    public VideoView getEyes() {
        return eyes;
    }

    public VideoView getMouse() {
        return mouse;
    }


}
