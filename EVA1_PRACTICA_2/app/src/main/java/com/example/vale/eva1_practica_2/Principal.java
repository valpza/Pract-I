package com.example.vale.eva1_practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView TxtVv, TxtVm, TxtVG;
    RadioButton rbRDesa, rbAme, rbAsi, rbAfri, rbH, rbM;
    EditText edT;
    RadioGroup RGN, RGG;
    int des, sum, DG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TxtVv = findViewById(R.id.TxtVv);
        TxtVm = findViewById(R.id.TxtVm);
        TxtVG = findViewById(R.id.TxtVG);
        rbRDesa = findViewById(R.id.rbRDesa);
        rbAme = findViewById(R.id.rbAme);
        rbAsi = findViewById(R.id.rbAsi);
        rbAfri = findViewById(R.id.rbAfri);
        rbH = findViewById(R.id.rbH);
        rbM = findViewById(R.id.rbM);
        edT = findViewById(R.id.edT);
        RGN =findViewById(R.id.RGN);
        RGG = findViewById(R.id.RGG);

        RGN.setOnCheckedChangeListener(this); //escuchador
        RGG.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String valor_String = edT.getText().toString();
        int n = Integer.parseInt(valor_String);

        switch (checkedId) {
            case R.id.rbRDesa://aqui se sabe cual boton pico
                if (n >= 1950 && n <= 1959) {
                    DG = 10;
                    des = 75;
                }
                if (n >= 1960 && n <= 1969) {
                    DG = 9;
                    des = 75;

                }
                if (n >= 1970 && n <= 1979) {
                    DG = 8;
                    des = 80;
                }
                if (n >= 1980 && n <= 1989) {
                    DG = 7;
                    des = 80;
                }
                if (n >= 1990 && n <= 1999) {
                    DG = 6;
                    des = 85;
                }
                if (n >= 2000) {
                    DG = 4;
                    des = 90;
                }
                break;


            case R.id.rbAme:
                if (n >= 1950 && n <= 1959) {
                    DG = 10;
                    des = 60;
                }
                if (n >= 1960 && n <= 1969) {
                    DG = 9;
                    des = 65;
                }
                if (n >= 1970 && n <= 1979) {
                    DG = 8;
                    des = 70;
                }
                if (n >= 1980 && n <= 1989) {
                    DG = 7;
                    des = 75;
                }
                if (n >= 1990 && n <= 1999) {
                    DG = 6;
                    des = 75;
                }
                if (n >= 2000) {
                    DG = 4;
                    des = 70;
                }
                break;


            case R.id.rbAsi:
                if (n >= 1950 && n <= 1959) {
                    DG = 10;
                    des = 45;
                }
                if (n >= 1960 && n <= 1969) {
                    DG = 9;
                    des = 50;
                }
                if (n >= 1970 && n <= 1979) {
                    DG = 8;
                    des = 65;
                }
                if (n >= 1980 && n <= 1989) {
                    DG = 7;
                    des = 65;
                }
                if (n >= 1990 && n <= 1999) {
                    DG = 6;
                    des = 60;
                }
                if (n >= 2000) {
                    DG = 4;
                    des = 60;
                }
                break;


            case R.id.rbAfri:
                if (n >= 1950 && n <= 1959) {
                    DG = 10;
                    des = 35;
                } else if (n >= 1960 && n <= 1969) {
                    DG = 9;
                    des = 45;
                } else if (n >= 1970 && n <= 1979) {
                    DG = 8;
                    des = 55;
                } else if (n >= 1980 && n <= 1989) {
                    DG = 7;
                    des = 60;
                } else if (n >= 1990 && n <= 1999) {
                    DG = 6;
                    des = 60;
                } else if (n >= 2000) {
                    DG = 4;
                    des = 60;
                }
                break;
        }


        sum = (DG / 2);
        if (rbH.isChecked()) {
            int res = des - sum;
            String resu = String.valueOf(res);
            TxtVv.setText("Expectativa de vida:  " + resu);
            TxtVm.setText("Fecha probable de decenso: " + (res + n));
        }
        if (rbM.isChecked()) {
            int res = des + sum;
            String resu = String.valueOf(res);
            TxtVv.setText("Expectativa de vida:  " + resu);
            TxtVm.setText("Fecha probable de decenso: " + (res + n ));
        }



    }

}