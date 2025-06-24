package com.example.sumadenumeros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);
        btnSumar = (Button) findViewById(R.id.btnSuma);
        btnRestar = (Button) findViewById(R.id.btnResta);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicacion);
        btnDivision = (Button) findViewById(R.id.btnDivision);

        btnSumar.setOnClickListener(v ->{
            try{
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double resultado = Operaciones.sumar(n1, n2);
                Operaciones op = new Operaciones(resultado);

                Intent intent = new Intent(MainActivity.this,Operaciones.class);
                intent.putExtra("resultado",op.getResultado());
                startActivity(intent);


            }
            catch (NumberFormatException e){
                Toast.makeText(this, "Ingrese valores válidos", Toast.LENGTH_SHORT).show();

            }



        });
    }
}