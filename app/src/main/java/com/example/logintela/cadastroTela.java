package com.example.logintela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cadastroTela extends AppCompatActivity {

    private EditText user;
    private EditText email;
    private EditText sen;
    private EditText conf;
    private Button bt_cad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_tela);

        user.findViewById(R.id.cad_user);
        email.findViewById(R.id.cad_email);
        sen.findViewById(R.id.cad_senha);
        conf.findViewById(R.id.cad_confirm);
        bt_cad.findViewById(R.id.bt_cad);

        bt_cad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                if (TextUtils.isEmpty(user.getText())) {
                    user.setError("Nome é necessário para cadastrar.");
                } else if (TextUtils.isEmpty(email.getText())) {
                    email.setError("Email é necessário para cadastrar.");
                } else if (TextUtils.isEmpty(sen.getText())) {
                    sen.setError("Senha é necessário para cadastrar.");
                } else {
                    Intent Login = new Intent(cadastroTela.this, MainActivity.class);
                    startActivity(Login);
                }
            }
        });
    }


}