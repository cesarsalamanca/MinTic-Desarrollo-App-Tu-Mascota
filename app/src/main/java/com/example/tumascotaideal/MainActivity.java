package com.example.tumascotaideal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    String [][] datos =  {
        {"Odie", "Ubicacion: Bogota" },
        {"Bolt", "Ubicacion: Bogota" },
        {"Lucas", "Ubicacion: Bogota" },
        {"Tiger", "Ubicacion: Bogota" },
        {"Tom", "Ubicacion: Bogota" },
        {"Figaro", "Ubicacion: Bogota" },
    };

   int [] datosImg = {R.drawable.odie,R.drawable.bolt,R.drawable.lucas,R.drawable.tiger,R.drawable.tom,R.drawable.figaro };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listViewMascotas);
        listview.setAdapter(new Adapter(this,datos,datosImg));


    }
}