package com.example.streettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login2 extends AppCompatActivity {

    private EditText nombre, apellido, correo, alias, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        nombre = (EditText) findViewById(R.id.edit_nombre);
        apellido = (EditText) findViewById(R.id.edit_apellido);
        correo = (EditText) findViewById(R.id.edit_correo);
        alias = (EditText) findViewById(R.id.edit_alias);
        clave = (EditText) findViewById(R.id.edit_password);
    }

    public void continuar_login2(View v){
        if (validar()){
            Toast.makeText(getApplicationContext(),"ingreso los datos", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Los datos no fueron ingresados", Toast.LENGTH_SHORT).show();

        }
    }

    public boolean validar(){

        boolean retorno = true;
        String campo_nombre = nombre.getText().toString();
        String campo_apellido = apellido.getText().toString();
        String campo_correo = correo.getText().toString();
        String campo_alias = alias.getText().toString();
        String campo_clave = clave.getText().toString();
        if (campo_nombre.isEmpty()){
            nombre.setError("Debe ingresar un nombre");
            retorno = false;
        }
        if (campo_apellido.isEmpty()){
            apellido.setError("Debe ingresar un apellido");
            retorno = false;
        }
        if (campo_correo.isEmpty()){
            correo.setError("Debe ingresar un correo");
            retorno = false;
        }
        if (campo_alias.isEmpty()){
            alias.setError("Debe ingresar un alias");
            retorno = false;
        }if (campo_clave.isEmpty()){
            clave.setError("Debe ingresar una clave");
            retorno = false;
        }


        return retorno;
    }
}