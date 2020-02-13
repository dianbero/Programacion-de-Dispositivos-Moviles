package es.iesnervion.diana.a2examen2eval.ViewHolder;

import android.widget.TextView;

public class ViewHolderAtleta {

    private TextView txtNombreAtleta;

    public ViewHolderAtleta(TextView txtNombreAtleta){
        this.txtNombreAtleta = txtNombreAtleta;
    }

    public TextView getTxtNombreAtleta() {
        return txtNombreAtleta;
    }

    public void setTxtNombreAtleta(TextView txtNombreAtleta) {
        this.txtNombreAtleta = txtNombreAtleta;
    }
}
