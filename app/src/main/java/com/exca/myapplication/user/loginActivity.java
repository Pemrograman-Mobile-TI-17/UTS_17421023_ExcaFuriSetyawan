package com.exca.myapplication.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.exca.myapplication.R;

public class loginActivity extends AppCompatActivity {
    Button btnDaftar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnDaftar = (Button) findViewById(R.id.btnregis);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginActivity.this, RegisActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}
