package es.iesnervion.diana.appabrircamaramovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView image, image2;
    Button btnCamara, btnVolver;
    private static final int CAMERA_PICTURE_ID = 1;

    /*
    * Info para App Cámara:
    * https://stackoverflow.com/questions/5991319/capture-image-from-camera-and-display-in-activity
    * De Página Android:
    * https://developer.android.com/training/camera/photobasics
    * GeeksForGeeks:
    * https://www.geeksforgeeks.org/android-how-to-open-camera-through-intent-and-display-captured-image/*/

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image = findViewById(R.id.imagenCamara);

        btnCamara = findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(this);
        //setContentView(btnCamara);


    }

    @Override
    public void onClick(View view) {
        //Intent intentOpenCamera = new Intent("android.media.action.IMAGE_CAPTURE"); //si falla probar, sin comillas: android.provider.MediaStore.ACTION_IMAGE_CAPTURE
        Intent intentOpenCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intentOpenCamera, CAMERA_PICTURE_ID);
    }

    protected void  onActivityResult(int requestCode, int resultCode, Intent data){
        setContentView(R.layout.layout_imagen_camara);
        image2 = findViewById(R.id.imagenCamara2);
        btnVolver = findViewById(R.id.btnVolver);
        //Vuelve a la página de foto
        btnVolver.setOnClickListener(this);

        if(requestCode == 1){
            //Convierte la imagen a un formato BitMap para almacenar
            Bitmap imagen = (Bitmap) data.getExtras().get("data");
            //Manda la imagen obtenida en la vista image2
            image2.setImageBitmap(imagen);

        }
    }


}



