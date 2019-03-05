package com.softwaresolution.sakahan_app.FarmerPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.softwaresolution.sakahan_app.R;

public class Login extends AppCompatActivity {
    Button bttn_login;
    TextView text_signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyer_login);

        bttn_login = (Button) findViewById(R.id.bttn_login);
        text_signup = (TextView) findViewById(R.id.text_signup);

        bttn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, FarmerMain.class);
                startActivity(intent);
            }
        });
        text_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}
