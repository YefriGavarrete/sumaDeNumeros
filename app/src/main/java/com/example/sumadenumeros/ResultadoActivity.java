package com.example.sumadenumeros;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {
    
    TextView txtResultado;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);

        double resultado = getIntent().getDoubleExtra("resultado", 0);
        Operaciones operaciones = new Operaciones(resultado);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtResultado.setText("Resultado" + operaciones.getResultado());

    }
}