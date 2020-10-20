//José vitor alves Pignataro
//96150
//Sexto Semestre

package com.example.pinh4tapizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Pinh4ta_pizzaria extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinh4ta_pizzaria);
    }
    //declaro um textview global
    TextView notifica = (TextView) findViewById(R.id.notificaoRegistropedido);

    //função seta o textview vazio para tal valor ao clicar no botão.
    public void OnclickRegitrando(View view){
        notifica.setText("Registando Pedido...");
    }
    //função seta o textview vazio para tal valor ao clicar no botão.
    public void OnclickHoursRegis(View view){
        notifica.setText("Registrando Horas...");
    }


}