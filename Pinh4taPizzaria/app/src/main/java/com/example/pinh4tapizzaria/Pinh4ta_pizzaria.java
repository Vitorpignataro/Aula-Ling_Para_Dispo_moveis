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
        //declaração do botão registrar e o texto vazio que reage com o click dos botões
        Button buttonRegis = (Button) findViewById(R.id.buttonRegistrar);
        final TextView notifica = (TextView) findViewById(R.id.notificaoRegistropedido);

        buttonRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ao clicar no buttonRegis ele chama o textview abaixo
                notifica.setText("Registando Pedido");
            }
        });
        //declaração do botão responsável pelas horas
        Button burronTlhoras = (Button) findViewById(R.id.buttonTotalhoras);

        burronTlhoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ao clicar no burronTlhoras ele chama o textview abaixo
                notifica.setText("Total De Horas");
            }
        });

    }









}