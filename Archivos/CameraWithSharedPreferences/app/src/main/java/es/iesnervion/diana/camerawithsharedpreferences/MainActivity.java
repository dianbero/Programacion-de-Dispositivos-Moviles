package es.iesnervion.diana.camerawithsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    static final int CAMERA_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Camera will start just when opening the app
        cameraIntent();

    }

    private void cameraIntent(){
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_ID);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = null;

        if(requestCode == CAMERA_ID && resultCode == RESULT_OK){
            bitmap = (data.getExtras()).getParcelable("data");
            ImageView imageView = (ImageView) findViewById(R.id.image);
            imageView.setImageBitmap(bitmap);
        }

        //Convert bitmap to Base64 to store it in file with SharedPreferences
        ByteArrayOutputStream  conversion = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, conversion);
        byte[] bytes = conversion.toByteArray();

        String encodedImage = Base64.encodeToString(bytes, Base64.DEFAULT);

        TextView textEncoded = (TextView)findViewById(R.id.textEncode);
        textEncoded.setText(encodedImage);

        //Using SharedPreferences
        SharedPreferences shPref = getSharedPreferences("image", 100);

        /*... apparently is not convenient to use sharedPreferences to store Images
        * so I'll stop coding anything here, and maybe try another thing another time*/





    }

    //Using sharedPreferences



}
