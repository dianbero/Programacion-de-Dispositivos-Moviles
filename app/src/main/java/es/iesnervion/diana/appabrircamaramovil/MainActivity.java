package es.iesnervion.diana.appabrircamaramovil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagenCamara;
    Button btnCamara, btnVolver;
    String pathFotoActual;
    private static final int CAMERA_PICTURE_ID = 1;
    private static final int CAMERA_PERMISSION_CODE = 100;

    /*Try this:
    * https://stackoverflow.com/questions/8560501/android-save-image-into-gallery/12678282 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamara = findViewById(R.id.btnCamara);
        comprobarPermisosCamara(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
        btnCamara.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        hacerFotoIntent();
    }

    public void hacerFotoIntent(){

        Intent hacerFotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(hacerFotoIntent.resolveActivity(getPackageManager()) != null){ //verificación: Comprueba que una actividad para la cámara que se encargue del intent //si llamas a startActivityForResult() con un intent que ninguna app puede manejar, la app fallará
            //Creación de archivo para la foto
            /*File archivoFoto = null;
            try{
                archivoFoto = crearArchivoImagen();
            }catch (IOException ex){
                Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show(); //Error al crear el archivo
                //ex.getStackTrace();
            }
            //Si el archivo se creó correctamente:
            if(archivoFoto != null){
                Uri fotoURI = FileProvider.getUriForFile(this,"com.example.android.fileprovider",  archivoFoto);

                //Uri fotoURI = FileProvider.getUriForFile(this,"com.mydomain.fileprovider",  archivoFoto);

                hacerFotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, fotoURI);
                startActivityForResult(hacerFotoIntent, CAMERA_PICTURE_ID); //si sí creo fichero

                meterFotoEnGaleria();
            }*/

           startActivityForResult(hacerFotoIntent, CAMERA_PICTURE_ID); //si no creo fichero
        }
    }


    private void comprobarPermisosCamara(String permiso, int codigoPermiso){
        if(ContextCompat.checkSelfPermission(MainActivity.this, permiso) == PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{permiso}, codigoPermiso);

        }else{
            Toast.makeText(MainActivity.this, "Permiso ya concedido", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestedPermissionsresult(int codigoPermiso, @NonNull String[] permisos, @NonNull int[] resultados){super.onRequestedPermissionsresult(codigoPermiso, permisos)}{

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        setContentView(R.layout.layout_imagen_camara);
        imagenCamara = findViewById(R.id.imagenCamara);
        btnVolver = findViewById(R.id.btnVolver);

        //intent para volver a la página principal
        //intentVolverAPrincipal();

        //Vuelve a la página de foto
        btnVolver.setOnClickListener(this);

        //Obtención imagen
        if(requestCode == CAMERA_PICTURE_ID && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagenBitmap = (Bitmap) extras.get("data");
            imagenCamara.setImageBitmap(imagenBitmap);
        }
    }

/*
    private File crearArchivoImagen() throws IOException{
        //Creación nombre imagen
        String tiempoFoto = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()); //Texto fecha foto
        String nombreArchivoImagen = "JPEG_" + tiempoFoto + "_"; //Texto archivo foto
        File directorioGuardado = getExternalFilesDir(Environment.DIRECTORY_PICTURES);  //Directorio donde se guarda
        File archivoImagen = File.createTempFile(nombreArchivoImagen, ".jpg", directorioGuardado);  //Archivo final imagen

        pathFotoActual = archivoImagen.getAbsolutePath(); //Guarda archivo: path para usar con Action_VIEW intents
        return archivoImagen;
    }

    private void meterFotoEnGaleria(){
        Intent intentMedia = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File file = new File(pathFotoActual);
        Uri fotoURI = Uri.fromFile(file);
        intentMedia.setData(fotoURI);
        this.sendBroadcast(intentMedia);
    }
*/
    /*
    public void intentVolverAPrincipal(){
        Intent intentVolver = new Intent(MainActivity.this, ImagenActivity.class);
        startActivity(intentVolver);
    }
    */
}




