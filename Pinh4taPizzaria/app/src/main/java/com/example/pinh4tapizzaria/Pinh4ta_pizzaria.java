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

        Button buttonRegis = (Button) findViewById(R.id.buttonRegistrar);
        final TextView notifica = (TextView) findViewById(R.id.notificaoRegistropedido);

        buttonRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifica.setText("Registando Pedido");
            }
        });

        Button burronTlhoras = (Button) findViewById(R.id.buttonTotalhoras);

        burronTlhoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifica.setText("Total De Horas");
            }
        });

    }









}