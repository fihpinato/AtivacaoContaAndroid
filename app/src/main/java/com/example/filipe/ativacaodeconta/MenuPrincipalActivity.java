package com.example.filipe.ativacaodeconta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPrincipalActivity extends AppCompatActivity {

    private TextView tvUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        if(getIntent() != null){
            tvUsuario.setText(getIntent().getStringExtra("USUARIO"));
        }
    }
}
