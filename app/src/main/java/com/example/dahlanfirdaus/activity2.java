package com.example.dahlanfirdaus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        txEmail = findViewById(R.id.email);

        txPassword = findViewById(R.id.password);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");


        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }

}