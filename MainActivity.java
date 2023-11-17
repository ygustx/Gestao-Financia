package com.example.inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText senha;
    //private Attribute botao;

    private View botao;
    private Attributes botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.usuario);
        senha = findViewById(R.id.senha);
        botao = findViewById(R.id.Esqueceu);
        botaoCadastrar =  findViewById(R.id.Cadastrar);
    }

    //public void login(View view){
    // String log = (login.getText().toString());
    // Double sen = Double.parseDouble(senha.getText().toString());
    // int sen = Integer.parseInt(senha.getText().toString());
}
}