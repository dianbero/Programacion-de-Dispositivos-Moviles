package es.iesnervion.diana.appabrircamaramovil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagenCamara;
    Button btnCamara, btnVolver;
    String pathFotoActual;
    private static final int CAMERA_PICTURE_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamara = findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        hacerFotoIntent();
    }

    public void hacerFotoIntent(){
        Intent hacerFotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(hacerFotoIntent.resolveActivity(getPackageManager()) != null){ //verificación: Comprueba que una actividad para la cámara que se encargue del intent //si llamas a startActivityForResult() con un intent que ninguna app puede manejar, la app fallará
            //Creación de acrhivo para la foto
            /*File archivoFoto = null;
            try{
                archivoFoto = createImageFile();
            }catch (IOException ex){
                Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show(); //Error occurred while creating the File
            }
            //Si el archivo se creó correctamente:
            if(archivoFoto != null){
                Uri fotoURI = FileProvider.getUriForFile(this,"com.example.android.fileprovider",  archivoFoto);


                hacerFotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, fotoURI);
                startActivityForResult(hacerFotoIntent, CAMERA_PICTURE_ID); //si sí creo fichero
            }*/

            startActivityForResult(hacerFotoIntent, CAMERA_PICTURE_ID); //si no creo fichero

            //Intent vistaFoto = new Intent(this, ImagenActivity.class);
            //startActivity(vistaFoto);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        setContentView(R.layout.layout_imagen_camara);
        imagenCamara = findViewById(R.id.imagenCamara);
        btnVolver = findViewById(R.id.btnVolver);
        //Vuelve a la página de foto
        //btnVolver.setOnClickListener(this);
        btnVolver.setOnClickListener(this);

        Intent i = new Intent(MainActivity.this, ImagenActivity.class);
        startActivity(i);

        if(requestCode == CAMERA_PICTURE_ID && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagenBitmap = (Bitmap) extras.get("data");
            imagenCamara.setImageBitmap(imagenBitmap);
        }
    }

   /* private File createImageFile() throws IOException{
        //Creación nombre imagen
        String tiempoFoto = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nombreArchivoImagen = "JPEG_" + tiempoFoto + "_";
        File directorioGuardado = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File archivoImagen = File.createTempFile(nombreArchivoImagen, ".jpg", directorioGuardado);

        pathFotoActual = archivoImagen.getAbsolutePath();
        return archivoImagen;
    }

    private void meterFotoEnGaleria(){
        //Intent intentMedia = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        Intent intentMedia = new Intent(Intent.ACTION_SEND);
        File file = new File(pathFotoActual);
        Uri fotoURI = Uri.fromFile(file);
        intentMedia.setData(fotoURI);
        this.sendBroadcast(intentMedia);
    }
*/
}




