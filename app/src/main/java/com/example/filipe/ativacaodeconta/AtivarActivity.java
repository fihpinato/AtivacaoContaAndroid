package com.example.filipe.ativacaodeconta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AtivarActivity extends AppCompatActivity {

    public final static int REQUEST_CODE_GERAR_CHAVE = 1;
    private EditText etChave;
    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ativar);

        etChave = (EditText) findViewById(R.id.etChave);
    }

    public void pegarChave(View v){
        Intent telaPegarChave = new Intent(this, GerarChaveActivity.class);
        startActivityForResult(telaPegarChave, REQUEST_CODE_GERAR_CHAVE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_GERAR_CHAVE && resultCode == RESULT_OK){

            etChave.setText(data.getStringExtra("CHAVE"));
            usuario = data.getStringExtra("USUARIO");
        }
    }

    public void registrar(View v){
        String chave = etChave.getText().toString();

        if(usuario.equals("") || chave.equals("")) {
            Toast.makeText(this, "Usuario/chave não encontrado", Toast.LENGTH_SHORT).show();
        } else {
            Intent menuPrincipal = new Intent(this, MenuPrincipalActivity.class);

        }
    }
}
