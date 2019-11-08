package es.iesnervion.diana.appabrircamaramovil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Save {
/*
    private Context contextSave;
    private String nameOfFolder = "/Gallery";
    private String nameOfFile = "imageCreated";

    //Método para guardar la imagen
    public void saveImage(Context context, Bitmap imageToSave){
        contextSave = context;
        String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() + nameOfFolder; //Crea ruta de archivo
        //Es necesario para ir guardando más imágenes, si no, las fotos se irán sobreescribiendo porque el nombre del fichero es el mismo
        String fechaYHoraActual = getCurrentDateAndTime(); //Falta por implementear

        //Crea archivo
        File dir = new File(filePath);
        if(!dir.exists()){ //si existe el fichero en el directorio
            dir.mkdirs();
        }

        String completeNameFile = nameOfFile + fechaYHoraActual + ".jpg";
        File file = new File(dir, completeNameFile);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream((file);

            imageToSave.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            messageAbleToSave(); //mensaje de que se ha guardado correctamente
        }catch (FileNotFoundException e){
            messageUnableToSave(); //mensaje de que no se ha guardado correctamente
        }catch (IOException e){
            unableToSave();
        }
    }

    private String getCurrentDateAndTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-HH-mm-ss");
        String formattedDate = dateFormat.format(calendar.getTime());
        return formattedDate;
    }

    private void messageAbleToSave(){
        Toast.makeText(contextSave, )
    }
*/
}
