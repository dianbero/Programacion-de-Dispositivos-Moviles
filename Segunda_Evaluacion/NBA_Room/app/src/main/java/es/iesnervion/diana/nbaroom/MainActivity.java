package es.iesnervion.diana.nbaroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Help:
        * cómo guardar contenido en BBDD con Room:
        * https://developer.android.com/training/data-storage/room
        * Steps to implement Room library:
        * https://android.jlelse.eu/5-steps-to-implement-room-persistence-library-in-android-47b10cd47b24
        * */
    }
}
