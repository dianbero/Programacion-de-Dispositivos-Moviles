package es.iesnervion.diana.appabrircamaramovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImagenActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView imagenCamara;
    Button btnVolver;
    //String pathFotoActual;
    //private static final int CAMERA_PICTURE_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_imagen_camara);

        imagenCamara = findViewById(R.id.imagenCamara);
        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        volverPaginaPrincipalIntent();
    }
    private void volverPaginaPrincipalIntent(){
        Intent intentVolver = new Intent(ImagenActivity.this, MainActivity.class);
        startActivity(intentVolver);
    }
}
