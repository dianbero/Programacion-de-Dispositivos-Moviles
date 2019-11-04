package es.iesnervion.diana.appabrircamaramovil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;

public class Save {

    private Context contextSave;
    private String nameOfFolder = "/Gallery";
    private String nameOfFile = "imageCreated";

    //Método para guardar la imagen
    public void saveImage(Context context, Bitmap imageToSave){
        contextSave = context;
        String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() + nameOfFolder; //Crea ruta de archivo
        //Es necesario para ir guardando más imágenes, si no, las fotos se irán sobreescribiendo porque el nombre del fichero es el mismo
        String fechaYHoraActual = getCurrentDateAndTime();
    }
}
