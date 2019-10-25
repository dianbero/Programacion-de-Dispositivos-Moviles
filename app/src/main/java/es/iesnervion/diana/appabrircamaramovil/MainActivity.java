package es.iesnervion.diana.appabrircamaramovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView image;
    Button btnCamara;

    /*
    * Info para App Cámara:
    * https://stackoverflow.com/questions/5991319/capture-image-from-camera-and-display-in-activity
    * De Página Android:
    * https://developer.android.com/training/camera/photobasics*/

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamara = (Button) findViewById(R.id.btnCamara);


    }

    @Override
    public void onClick(View view) {
        //Intent intentOpenCamera = new Intent("android.media.action.IMAGE_CAPTURE"); //si falla probar, sin comillas: android.provider.MediaStore.ACTION_IMAGE_CAPTURE
        Intent intentOpenCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        //startActivityForResult(intentOpenCamera, Integer.parseInt(CAMERA_SERVICE));
        startActivityForResult(intentOpenCamera, );
        //startActivity(intentOpenCamera);
    }

    protected void  onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == CAMERA_PIC_REQUEST){

        }
    }
}
