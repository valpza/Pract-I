package com.example.iowner.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Principal extends AppCompatActivity implements View.OnClickListener {//Creamos un listener
    TextView txtV;//este obejeto se vincula

    Button btnInterfaz;
    Button btnAnonima;
    Button btnPorclase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Vinculas el evento
        txtV = findViewById(R.id.txtV);
        btnInterfaz = findViewById(R.id.btnInterfaz);
        btnAnonima = findViewById(R.id.btnAnonima);
        btnPorclase = findViewById(R.id.btnPorclase);
        btnInterfaz.setOnClickListener(this);//asignamos el listener

        //Usamos el objeto
        txtV.setText("Hola mundo cruel");
        //CREAR el evento
        final Context cntApp = getApplicationContext();
        btnAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cntApp,"Hola por clase anonima",Toast.LENGTH_LONG).show();
            }
        });
        ClickListener miCLick = new ClickListener();
        btnPorclase.setOnClickListener(miCLick);


    }
    public void MiClick(View v){
        Toast.makeText(this,"Hola por XML",Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Hola por interfaz",Toast.LENGTH_LONG).show();

    }
    public void MiiClick(View v){
        Toast.makeText(this,"Hola por clase",Toast.LENGTH_LONG).show();
    }

}
