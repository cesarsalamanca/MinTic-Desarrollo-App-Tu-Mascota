package com.example.tumascotaideal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] datos;
    int [] datosImg;


    public Adapter(Context contexto, String[][] datos, int[] imagenes) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView nombreMascota = (TextView) vista.findViewById(R.id.textNombreMascota);
        TextView ubicacionMascota = (TextView) vista.findViewById(R.id.textView3);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imagenMascota);

        nombreMascota.setText(datos[i][0]);
        ubicacionMascota.setText(datos[i][1]);
        imagen.setImageResource(datosImg[i]);

//      imagen.setTag(i);
        return vista;
    }

    @Override
    public int getCount() {
//        return datos.length;
        return datosImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
