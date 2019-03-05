package com.softwaresolution.sakahan_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivty extends AppCompatActivity {
    Button bttn_buyer,bttn_farmer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttn_buyer = (Button) findViewById(R.id.bttn_buyer);
        bttn_farmer = (Button) findViewById(R.id.bttn_farmer);
        bttn_buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivty.this, com.softwaresolution.sakahan_app.BuyerPackage.Login.class);
                startActivity(intent);
            }
        });
        bttn_farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivty.this, com.softwaresolution.sakahan_app.FarmerPackage.Login.class);
                startActivity(intent);
            }
        });
    }
}
