package com.example.iowner.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener {

    RadioGroup rdGroupOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGroupOpciones = findViewById(R.id.rdGroupOpciones);
        rdGroupOpciones.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String sG = "";
        switch (i){
            case R.id.rdBTa:
                sG = "Tacos";
                break;
            case R.id.rdBTo:
                sG = "Tortas";
                break;
            case R.id.rdBTam:
                sG = "Tamales";
                break;
            case R.id.rdBCR:
                sG = "Chiles Rellenos";
                break;
            case R.id.rdBM:
                sG = "Montados";
                break;
        }
        Toast.makeText(this,sG,Toast.LENGTH_LONG).show();
    }
}
