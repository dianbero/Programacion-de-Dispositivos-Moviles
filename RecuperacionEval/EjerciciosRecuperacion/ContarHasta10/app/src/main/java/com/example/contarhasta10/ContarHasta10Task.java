package com.example.contarhasta10;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;


public class ContarHasta10Task extends AsyncTask<Integer, Void, Integer> {

    private Button btnContar;
    private TextView txtCuenta;
//    private Activity activity;

    public ContarHasta10Task(Activity activity) {
//        this.activity = activity;
        this.btnContar = activity.findViewById(R.id.btnContar);
        this.txtCuenta = activity.findViewById(R.id.cuenta);
    }

    /**
     * IMPORTANTE: En este método no se pueden actualizar los elementos de la vista, y es
     * el más importante y el que obliga a implementar, porque es el que realiza los cálculos
     * que realiza el AsyncTask
     *
     * Método que aumenta el número pasado como parámetro en uno
     * @param integers entero pasado como parámetro al execute para sumarlo cada vez que se repita
     *                 la tarea, y vaya realizando la cuenta
     * @return  el entero actualizado, aumentado en uno
     */
    @Override
    protected Integer doInBackground(Integer... integers) {
        integers[0]++;
        //Hago que se atrase un segundo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return integers[0];
    }

    /**
     * Método que se ejecuta antes de realizar la tarea y lo que hace es mostrar
     * un cero, como inicio de la cuenta, y deshabilitar el botón.
     */
    @Override
    protected void onPreExecute() {
        btnContar.setEnabled(false);
        txtCuenta.setText("0");
    }

    /**
     * Método que muestra en la vista el resultado del cálculo realizado en el método
     * doInBackGround
     * @param s resultado obtenido del método doInBackGround, para mostrarlo en la vista
     */
    @Override
    protected void onPostExecute(Integer s) {
        //Cuando llegue al último elemento de la cuenta, habilita el botón, para poder volver a pulsarlo
        if (s == 10) {
            btnContar.setEnabled(true);
        }
        txtCuenta.setText(Integer.toString(s));

    }

//    @Override
//    protected void onProgressUpdate(Void... values) {
//        super.onProgressUpdate(values);
//    }

}
