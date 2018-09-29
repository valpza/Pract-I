package com.example.vale.eva1_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.Destroyable;

public class Principal extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener, CheckBox.OnClickListener{
    TextView TxtVC, TxtVE,TxtVCom,TxtVCa,TxtVComR;
    RadioButton rbAmeric, rbCapu, rbExpres;
    CheckBox cbAzucar, cbCrem;
    Button btT;
    EditText edT;
    RadioGroup RGC;
    String Des, Gua;
    int resu, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TxtVC = findViewById(R.id.TxtVC);
        TxtVE = findViewById(R.id.TxtVE);
        TxtVCa = findViewById(R.id.TxtVCa);
        TxtVComR = findViewById(R.id.TxtVComR);
        RGC = findViewById(R.id.RGC);
        rbAmeric = findViewById(R.id.rbAmeric);
        rbCapu = findViewById(R.id.rbCapu);
        rbExpres = findViewById(R.id.rbExpres);
        cbAzucar = findViewById(R.id.cbAzucar);
        cbCrem = findViewById(R.id.cbCrem);
        btT = findViewById(R.id.btT);
        edT = findViewById(R.id.edT);

        RGC.setOnCheckedChangeListener(this); //escuchador
        btT.setOnClickListener(this);
        cbAzucar.setOnClickListener(this);
        cbCrem.setOnClickListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) { //int es el id del boton que se presiono
        switch (checkedId){
            case R.id.rbAmeric://aqui se sabe cual boton pico
                Des = "Americano";
 //               Tot = 20;
                break;
            case R.id.rbCapu:
                Des = "Capuchino";
//                Tot =48;
                break;
            case R.id.rbExpres:
                Des = "Expreso" + ",";
 //               Tot = 30;
                break;
        }
          TxtVComR.setText(Des) ; //cambia a texto
    }


    @Override
    public void onClick(View v) {
        Gua = Des + "";

        if (cbAzucar.isChecked() == true) {
            //TxtVComR.setText("Azucar");
            Gua += "Azucar";
            sum += 1;
        }
        if (cbCrem.isChecked() == true) {
            // TxtVComR.setText("Crema");
            Gua += "Crema";
            sum += 1;
        }
        TxtVComR.setText(Gua);


        String valor_String = edT.getText().toString();
        int valor_int = Integer.parseInt(valor_String);

        if (rbAmeric.isChecked() == true) {
            int sumaA = (20 * valor_int);
            resu = sumaA;
        }
        if (rbCapu.isChecked() == true) {
            int sumaC = 42 * valor_int;
            resu = sumaC;
        }
        if (rbExpres.isChecked() == true) {
            int sumaE = 30 * valor_int;
            resu = sumaE;
        }


        if (v.getId() == R.id.btT) {
            int suma; //una variable para que no siga comprando suministros
            suma = sum + resu;
            String Suma = String.valueOf(suma);
            Toast.makeText(getApplicationContext(), Suma, Toast.LENGTH_LONG).show();

        }
    }

    //total = Integer.parseInt(Total)
}
