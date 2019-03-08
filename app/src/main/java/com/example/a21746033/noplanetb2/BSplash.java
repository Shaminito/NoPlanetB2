package com.example.a21746033.noplanetb2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

public class BSplash extends AppCompatActivity {

    private ImageView ivSplashBackground;
    private CircularImageView civLogo;
    private TextView tvTitulo1;
    private TextView tvTitulo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsplash);

        getSupportActionBar().hide();

        ivSplashBackground = findViewById(R.id.ivSplashBackground);

        civLogo = findViewById(R.id.civLogo);
        tvTitulo1 = findViewById(R.id.tvTitulo1);
        tvTitulo2 = findViewById(R.id.tvTitulo2);

        tvTitulo1.setVisibility(View.INVISIBLE);
        tvTitulo2.setVisibility(View.INVISIBLE);

        Glide.with(this)
                .load(R.drawable.planetearth)
                .into(ivSplashBackground);

        Animation desplazar = AnimationUtils.loadAnimation(BSplash.this, R.anim.desplazar_arriba);
        civLogo.startAnimation(desplazar);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tvTitulo1.setVisibility(View.VISIBLE);
                tvTitulo2.setVisibility(View.VISIBLE);
                Animation aparecer = AnimationUtils.loadAnimation(BSplash.this, R.anim.aparecer);
                tvTitulo1.startAnimation(aparecer);
                tvTitulo2.startAnimation(aparecer);
            }
        }, 500);

        Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BSplash.this,BLogin.class));
            }
        }, 3000);
    }
}
