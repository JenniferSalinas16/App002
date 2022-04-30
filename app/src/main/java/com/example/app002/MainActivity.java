package com.example.app002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTex1;
    private EditText editTex2;
    private Button btnSumar;
    private Button btnPotenciar;
    private EditText tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buscar los ids de los controles visuales
        editTex1 = (EditText) findViewById(R.id.editTextTextvalor1);
        editTex2 = findViewById(R.id.editTextvalor2);


        // tv resultado = findViewById(R.id.textViewTitulo);
    }
    public void onclickSumar(View view){
        String numero1= editTex1.getText().toString();
        String numero2= editTex2.getText().toString();
        int a,b;
        a=Integer.parseInt(numero1);
        b=Integer.parseInt(numero2);
        int suma;
        suma= a+b;
        String resultado = String.valueOf(suma);
        tvResultado.setText(resultado);
    }

}
