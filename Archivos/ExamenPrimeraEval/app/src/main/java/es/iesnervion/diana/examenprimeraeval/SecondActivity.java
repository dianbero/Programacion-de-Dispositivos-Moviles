package es.iesnervion.diana.examenprimeraeval;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private RadioGroup rgFiltrarCPU;
    private RadioButton rbTodos;
    private ListView lista;
    private ImageView imagenProducto;
    private ImageView imagenCPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}
