package com.example.mq12.enviardatosentreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textViewDato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewDato= (TextView) findViewById(R.id.textViewDato);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle !=  null){
            String cadena = (String)bundle.get("dato");
            textViewDato.setText(cadena);
        }
    }

}
