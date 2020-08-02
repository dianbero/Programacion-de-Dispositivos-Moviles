package es.iesnervion.diana.practicalistyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import es.iesnervion.diana.practicalistyroom.Activities.ListaUsuariosActivity;
import es.iesnervion.diana.practicalistyroom.Activities.UsuarioRegistradoActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtEdad;
    private String nombre;
    private int edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO guardar datos insertados del login en la lista

        txtNombre = (EditText) findViewById(R.id.loginNombre);
        txtEdad = (EditText) findViewById(R.id.loginEdad);

        //TODO cambiar texto de error rojo a texto color normal cuando se va a escribir
        //TODO intentar esto en otro momento
        //1-Cuando se pulsa para escribir se borra texto en rojo
        //2-Cuando se escribe el texto ya ha cambiado de color
        /*Help:
         * try with: setOnEditorActionListener(new OnEditorActionListener()
         *
         * Esto creo que no es: addTextChangedListener();*/
//        txtNombre.setOnEditorActionListener(cambiarColorTextoAlVolverAEscribir());

        //TODO guardar datos introducidos en lista


    }

    /**
     * Método que cambia el color de texto de mensaje de error a color normal
     * al volver a escribir
     *
     * @return
     */
//    public TextView.OnEditorActionListener cambiarColorTextoAlVolverAEscribir(){
//        TextView.OnEditorActionListener editor = new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
//                if(txtNombre.getTextColors().equals(Color.RED)){
//                    txtNombre.setTextColor(Color.BLACK);
//                }
//
//                if (txtEdad.getTextColors().equals(Color.RED)){
//                    txtEdad.setTextColor(Color.BLACK);
//                }
//
//                return false;
//            }
//        };
//
//        return editor;
//    }

//    public void login(View view) {
//
////        ArrayList<Usuario> lista =  guardarDatosEnLista();
//
//    }

    /**
     * Método manda los datos introducidos en la vista a una vista y los muestra
     * @param view
     */
    public void login(View view) {
//        Intent intent = new Intent(this, UsuarioRegistradoActivity.class);
        Intent intent = new Intent(this, UsuarioRegistradoActivity.class);
        boolean isVacio;

        //Obtengo los datos de la vista
        nombre = txtNombre.getText().toString();
        //Si la entrada de edad no está vacía lo asigna a un entero
        boolean esNumero = true;
        boolean nombreCorrecto = false;
        boolean edadCorrecta = false;
//        boolean isEmpty = txtEdad.getText().toString().isEmpty(); //Lo hice porque fallaba si lo ponía directamente, pero ahora parece que va

        //Comprobar que lo introducido en textBox edad es un número
        try {
            edad = Integer.parseInt(txtEdad.getText().toString());
        } catch (Exception e) {
            esNumero = false;
        }

        //Si el nombre no está vacío y es distinto al mensaje error
        if (!txtNombre.getText().toString().equals("") && !txtNombre.getText().toString().equals("Must add an name")) {
            intent.putExtra("nombre", nombre);
            nombreCorrecto = true;
        }
        //si está vacío
        else {
            //debe añadir edad y colorear en rojo
            txtNombre.setText("Must add an name");
            txtNombre.setTextColor(Color.RED);
        }

        //Si la edad no está vacía y es un número
        if (!txtEdad.getText().toString().isEmpty() && esNumero) {
            intent.putExtra("edad", edad);
            //Empieza actividad con intent con Nombre y edad
            edadCorrecta = true;
        }
        //Si está vacía
        else if (txtEdad.getText().toString().isEmpty()) {
            //Debe introducir un numero
            txtEdad.setText("Must add an age");
            txtEdad.setTextColor(Color.RED);
        }
        //Si no es un número
        else {
            //debe añadir un nombre
            txtEdad.setText("Must type a number");
            txtEdad.setTextColor(Color.RED);
        }


        //Si los datos son correctos empieza actividad
        if (nombreCorrecto && edadCorrecta) {
            startActivity(intent);
        }
    }

//    public ArrayList<Usuario> guardarDatosEnLista() {
//        String nombre = txtNombre.getText().toString();
//        int edad = Integer.parseInt(txtEdad.getText().toString());
//
//        return new ListaUsuarios().addNuevoUsuario(nombre, edad);
//    }

    /**
     * Método que inicia la actividad de la lista de elementos
     * @param view
     */
    public void verLista(View view) {
        //Si el id del elemento de la vista se corresponde con el del botón de ir a la lista
        if (view.getId() == R.id.btnLista) {
            Intent intent = new Intent(this, ListaUsuariosActivity.class);
//            intent.putExtra("lista", lista);
            startActivity(intent);
        }
    }

}
