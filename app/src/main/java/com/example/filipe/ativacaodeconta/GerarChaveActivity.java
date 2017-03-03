package com.example.filipe.ativacaodeconta;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class GerarChaveActivity extends AppCompatActivity {

    private TextInputLayout tilUsuario;
    private Spinner spPlanos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_chave);

        tilUsuario = (TextInputLayout) findViewById(R.id.tilUsuario);
        spPlanos = (Spinner) findViewById(R.id.spPlanos);
    }

    public void gerarCodigo(View v){
        Intent resultado = new Intent();
        resultado.putExtra("USUARIO", tilUsuario.getEditText().getText().toString());
        resultado.putExtra("CHAVE",spPlanos.getSelectedItem().toString());
        setResult(RESULT_OK, resultado);
        finish();
    }
}
