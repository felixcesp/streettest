package com.example.streettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ventana_login extends AppCompatActivity {

    private EditText usuario, contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_login);
        usuario = (EditText) findViewById(R.id.edit_usuario);
        contraseña = (EditText) findViewById(R.id.edit_password);

    }

    public void boton_registrar(View v){
        if (validar()){
            Toast.makeText(getApplicationContext(),"ingreso los datos", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Login2.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Los datos no fueron ingresados", Toast.LENGTH_SHORT).show();

        }
    }

    public boolean validar(){

        boolean retorno = true;
        String campo_usuario = usuario.getText().toString();
        String campo_pass = contraseña.getText().toString();
        if (campo_usuario.isEmpty()){
            usuario.setError("Debe ingresar un usuario");
            retorno = false;
        }
        if (campo_pass.isEmpty()){
            contraseña.setError("Debe ingresar una contraseña");
            retorno = false;
        }

        return retorno;
    }

}