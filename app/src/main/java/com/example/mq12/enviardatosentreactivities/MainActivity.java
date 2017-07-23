package com.example.mq12.enviardatosentreactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button boton;
    EditText editTextDatoEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.button);
        editTextDatoEnviar = (EditText) findViewById(R.id.editText);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.button:
        invocar();
        break;
    default:
        break;
}
    }

    private void invocar() {
        Intent intent  = new Intent(this, Main2Activity.class);
        String dato =  editTextDatoEnviar.getText().toString();
        intent.putExtra("dato", dato);
        startActivity(intent);
    }
}
