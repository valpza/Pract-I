package com.example.vale.eva1_3_linear_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    TextView TextVNom, TextVApe, TextVEd;
    Button btA, btC;
    RadioGroup RGG;
    RadioButton rdM, rdF, rdL, rdO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextVNom = findViewById(R.id.TextVNom);
        TextVApe = findViewById(R.id.TextVApe);
        TextVEd = findViewById(R.id.TextVNom);
        btA = findViewById(R.id.btA);
        btC  = findViewById(R.id.btC);
        RGG.setOnCheckedChangeListener(this);
        rdM = findViewById(R.id.rdM);
        rdF = findViewById(R.id.rdF);
        rdL = findViewById(R.id.rdL);
        rdO = findViewById(R.id.rdO);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }
}
