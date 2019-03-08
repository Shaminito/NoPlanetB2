package com.example.a21746033.noplanetb2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blogin);
    }

    public void c_btnLogin(View v){
        startActivity(new Intent(this,BMain.class));
    }
}
