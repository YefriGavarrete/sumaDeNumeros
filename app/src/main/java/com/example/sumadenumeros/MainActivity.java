package com.example.sumadenumeros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
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


        btnSumar.setOnClickListener(v -> operar("sumar"));
        btnRestar.setOnClickListener(v -> operar("restar"));
        btnMultiplicar.setOnClickListener(v -> operar("multiplicar"));
        btnDivision.setOnClickListener(v -> operar("division"));




    }
        private void operar(String operacion){

            try{
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double resultado = 0;
                switch (operacion){
                    case "sumar":
                        resultado = Operaciones.sumar(n1, n2);
                    break;
                    case "restar":
                        resultado = Operaciones.restar(n1, n2);
                        break;
                    case "multiplicar":
                        resultado = Operaciones.multiplicacion(n1, n2);
                        break;
                    case "division":
                         resultado = Operaciones.division(n1, n2);
                         break;

                }
                Intent intent = new Intent(MainActivity.this,ResultadoActivity.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);


            }
            catch (NumberFormatException e){
                Toast.makeText(this, "Ingrese valores válidos", Toast.LENGTH_SHORT).show();

            }
            catch (IllegalAccessError e){
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
}