package com.example.formulario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextParcial1 = findViewById(R.id.editTextParcial1);
        final EditText editTextParcial2 = findViewById(R.id.editTextParcial2);
        final EditText editTextPromedio = findViewById(R.id.editTextPromedio);
        Button btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener las notas de los parciales
                String strNotaParcial1 = editTextParcial1.getText().toString();
                String strNotaParcial2 = editTextParcial2.getText().toString();

                // Convertir las notas a números (asegúrate de manejar excepciones)
                double notaParcial1 = Double.parseDouble(strNotaParcial1);
                double notaParcial2 = Double.parseDouble(strNotaParcial2);

                // Calcular el promedio
                double promedio = (notaParcial1 + notaParcial2) / 2;

                // Mostrar el promedio en el EditText correspondiente
                editTextPromedio.setText(String.valueOf(promedio));
            }
        });
    }
}
