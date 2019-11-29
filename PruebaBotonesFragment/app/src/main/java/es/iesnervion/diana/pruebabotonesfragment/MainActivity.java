package es.iesnervion.diana.pruebabotonesfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;
    //Fragment fragment1, fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO:hacerlo también para tablets

        /*Ayuda fragments:
        * https://www.tutorialspoint.com/fragment-tutorial-with-example-in-android-studio        *
        * https://www.developer.com/ws/android/programming/working-with-fragments-in-android-applications.html
        * Instanciating a Fragment:
        * https://stackoverflow.com/questions/10450348/do-fragments-really-need-an-empty-constructor
        *
        * Some to have a look:
        * https://teamtreehouse.com/community/starting-a-fragment-from-an-activity
        *
        * Seems interesting:
        * https://www.raywenderlich.com/1364094-android-fragments-tutorial-an-introduction-with-kotlin#toc-anchor-004 *
        * */

        btn1 = findViewById(R.id.btnFirstFragment);
        btn1.setOnClickListener(this);
//        btn2 = findViewById(R.id.btnSecondFragment);
//        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
//        fragment1 = new FirstFragment();
        //FirstFragment.newInstance(1);
    }
}
