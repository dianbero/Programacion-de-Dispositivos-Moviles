package com.example.contar10conviewmodel.Tasks;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import com.example.contar10conviewmodel.R;
import com.example.contar10conviewmodel.ViewModels.ContarHasta10ViewModel;


public class ContarHasta10Task extends AsyncTask<Integer, Integer, Integer> {

    private Button btnContar;
    private TextView txtCuenta;
    private Activity activity;
    private ContarHasta10ViewModel vm;

    public ContarHasta10Task(Activity activity, ContarHasta10ViewModel vm) {
        this.activity = activity;
        this.btnContar = activity.findViewById(R.id.btnContar);
        this.txtCuenta = activity.findViewById(R.id.cuenta);
        this.vm = vm;
    }

    /**
     * Método que se ejecuta antes de realizar la tarea y lo que hace es mostrar
     * un cero, como inicio de la cuenta, y deshabilitar el botón.
     */
    @Override
    protected void onPreExecute() {
//        btnContar.setEnabled(false);
        vm.setBotonActivado(false);
    }

    /**
     * IMPORTANTE: En este método no se pueden actualizar los elementos de la vista, y es
     * el más importante y el que obliga a implementar, porque es el que realiza los cálculos
     * que realiza el AsyncTask
     * <p>
     * Método que aumenta el número pasado como parámetro en uno
     *
     * @param integers entero pasado como parámetro al execute para sumarlo cada vez que se repita
     *                 la tarea, y vaya realizando la cuenta
     * @return el entero actualizado, aumentado en uno
     */
    @Override
    protected Integer doInBackground(Integer... integers) {
//        integers[0]++; //Necesito esto si hago que el bucle for empiece en 0 y llegue hasta 10
        //Hago que se atrase un segundo

        for (int i = 0; i < integers[0]; i++) {
            //Método que llama a ejecutar onProgressUpdate, donde se actualizan los datos del VM para cambiar la vista
            publishProgress(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return integers[0];
    }

    /**
     * Actualiza la vista a los cambios que se van produciendo que quiero que se muestren mientras
     * el task está en marcha, es decir, mientras se ejecuta doInBackGround.
     * En este caso será ir mostrando los números de la cuenta
     *
     * Le pasa el valor obtenido al viewModel para acutalizar la vista
     *
     * @param values entero recibido del la llamada a publishProgress en doInBackGround
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        vm.setNumero(values[0]);

    }


    /**
     * Método que muestra en la vista el resultado del cálculo realizado en el método
     * doInBackGround
     *
     * @param s resultado obtenido del método doInBackGround, para mostrarlo en la vista
     */
    @Override
    protected void onPostExecute(Integer s) {

//        btnContar.setEnabled(true);
        vm.setBotonActivado(true);

    }


}
