package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner Puntaje1,Puntaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Puntaje1=findViewById(R.id.p1);
        Puntaje2=findViewById(R.id.p2);

        ArrayAdapter<CharSequence> adaptadorPuntaje = ArrayAdapter.
                createFromResource(getApplicationContext(), R.array.puntaje,
                        android.R.layout.simple_list_item_1);

        Puntaje1.setAdapter(adaptadorPuntaje);
        Puntaje2.setAdapter(adaptadorPuntaje);
    }
}
