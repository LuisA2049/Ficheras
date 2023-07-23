package com.example.ficheras;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private Button btnIngresar;
    private EditText edtUsuario, edtContra;
    private Context cn=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar = findViewById(R.id.btnIngresar);
        edtUsuario = findViewById(R.id.edtUsuario);
        edtContra = findViewById(R.id.edtContra);

        AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);

        builder.setMessage("CONTRASENA O USAURIO INCORRECTO");

        builder.setCancelable(false);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strUsua = edtUsuario.getText().toString();
                String strContra = edtContra.getText().toString();

                if(strUsua.equals("admin") && strContra.equals("admin")){
                    finish();
                    Intent open = new Intent(cn, MainActivity2.class);
                    startActivity(open);
                }else{
                    builder.setPositiveButton("ENTENDIDO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alertDialog = builder.create();

                    alertDialog.show();
                }

            }
        });

    }
}