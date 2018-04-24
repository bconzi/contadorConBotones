package com.example.brend.Contador_con_botones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    //variable que me cuenta la cantidad de veces que se pulsa el botón
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;
    }

    public void incrementaContador(View view){

    contador ++;

    mostrarResultado();
    }

    public void decrementaContador(View view){

        contador --;
        mostrarResultado();
    }
    public void reseteaContador(View view){

        contador=0;
        mostrarResultado();
    }

    //Cambiar el texto de la variable contador
    public void mostrarResultado(){

       TextView textoResultado= (TextView) findViewById(R.id.contador_pulsaciones);

       textoResultado.setText("Contador: "+contador);
    }
}
