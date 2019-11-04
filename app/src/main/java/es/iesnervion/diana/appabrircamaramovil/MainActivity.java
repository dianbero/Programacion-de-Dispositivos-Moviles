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

    //ImageView image;
    ImageView image2;
    Button btnCamara, btnVolver;
    private static final int CAMERA_PICTURE_ID = 1;
    String imagenPath;

    /*
     * Info para App Cámara:
     * https://stackoverflow.com/questions/5991319/capture-image-from-camera-and-display-in-activity
     * De Página Android:
     * https://developer.android.com/training/camera/photobasics
     * GeeksForGeeks:
     * https://www.geeksforgeeks.org/android-how-to-open-camera-through-intent-and-display-captured-image/
     stackOverFlow:
     https://stackoverflow.com/questions/41777836/using-camera-to-take-photo-and-save-to-gallery
     * The definitive guide:
     * https://androidstudiofaqs.com/tutoriales/guardar-una-imagen-android-studio*/
     


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image = findViewById(R.id.imagenCamara);

        btnCamara = findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(this); //Botón para acceder a la cámara
        //setContentView(btnCamara);

    }


    Intent intentOpenCamera;

    @Override
    public void onClick(View view) {
        //Intent intentOpenCamera = new Intent("android.media.action.IMAGE_CAPTURE"); //si falla probar, sin comillas: android.provider.MediaStore.ACTION_IMAGE_CAPTURE
        intentOpenCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intentOpenCamera, CAMERA_PICTURE_ID);

        //hacerFotoIntent();

    }

    /**
     * Método para crear el intent para abrir cámara, tomar foto y crear archivo de imagen para guardarla
     */
    private void hacerFotoIntent(){
        //intentOpenCamera = new Intent("android.media.action.IMAGE_CAPTURE"); //si falla probar, sin comillas: android.provider.MediaStore.ACTION_IMAGE_CAPTURE
        intentOpenCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intentOpenCamera, CAMERA_PICTURE_ID);
        //onActivityResult(CAMERA_PICTURE_ID, RESULT_OK, intentOpenCamera);


        /*File archivoFoto = null;
        try{
            archivoFoto = crearArchivoImagen();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        if(archivoFoto != null){
            Uri imagenUri = FileProvider.getUriForFile(this, "com.example.android.fileprovider", archivoFoto);
            intentOpenCamera.putExtra(MediaStore.EXTRA_OUTPUT, imagenUri);
            startActivityForResult(intentOpenCamera, CAMERA_PICTURE_ID);
        }*/
    }

    /**
     * Método para ralizar foto y mostrarla en una imagen establecida
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        setContentView(R.layout.layout_imagen_camara);
        image2 = findViewById(R.id.imagenCamara2);
        btnVolver = findViewById(R.id.btnVolver);
        //Vuelve a la página de foto
        btnVolver.setOnClickListener(this);

        if (requestCode == CAMERA_PICTURE_ID && resultCode == RESULT_OK && resultCode >-1) {

            Bitmap imagen = (Bitmap) data.getExtras().get("data"); //Convierte la imagen a un formato BitMap para almacenar
            image2.setImageBitmap(imagen); //Manda la imagen obtenida en la vista image2 para mostrarla
            //guardarImagenEnGaleria();

        }
    }

    //Guardar la imagen obtenida en gallería
    private void guardarImagenEnGaleria(){
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File nuevoArchivoImagen = new File(imagenPath);
        Uri contenidoUri = Uri.fromFile(nuevoArchivoImagen);
        mediaScanIntent.setData(contenidoUri);
        this.sendBroadcast(mediaScanIntent);
    }


    /**
     * Método para acceder al directorio para guardar imagen y crear los archivos de la imagen para guardarla en ese directorio
     * @return
     * @throws IOException
     */
    /*private File crearArchivoImagen() throws IOException {
        //Crear archivo de imagen
        //String de fecha de creación
        //String picTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        //String para el nombre del archivo de la foto con fecha
        //String nombreArchivoImagen = "JPEG_" + picTime + "_";
        //Dirección para guardar la imagen
        //File directorioGuardado = getExternalFilesDir(Environment.DIRECTORY_PICTURES);

        File directorioguardado = Environment.getExternalStorageDirectory();
        //Creación de directorio vacío en el directorio especificado
        File imagenAGuardar = File.createTempFile(nombreArchivoImagen, ".jpg", directorioGuardado);
        //Guardar archivo
        imagenPath = imagenAGuardar.getAbsolutePath();

        return imagenAGuardar;
    }*/

}




