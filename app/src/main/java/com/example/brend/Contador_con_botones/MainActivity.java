package com.example.brend.Contador_con_botones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    //variable que me cuenta la cantidad de veces que se pulsa el botón
    public int contador;
    public TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado= (TextView)findViewById(R.id.numero);
        contador=0;
    }

    public void incrementaContador(View view){

        contador ++;
        textoResultado.setText(""+contador);
    //mostrarResultado(); comentado en video 18
    }

    public void decrementaContador(View view){

        contador --;

        if (contador<0){

            CheckBox negativos=(CheckBox) findViewById(R.id.negativos);

            if (!negativos.isChecked()){

                contador=0;
            }
        }
        textoResultado.setText(""+contador);
    }

    public void reseteaContador(View view){

        EditText numero_reset= (EditText) findViewById(R.id.n_reseteo);


        try {
            contador = Integer.parseInt(numero_reset.getText().toString());
        } catch (Exception e){
            contador=0;
        }
        numero_reset.setText("");

        textoResultado.setText(""+contador);
    }


}
