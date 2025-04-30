package com.example.kfc01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button seeAllButton;
    private LinearLayout homeButton, cartButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // "See All" tugmasi
        seeAllButton = findViewById(R.id.button16);
        seeAllButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProductActivity.class);
            startActivity(intent);
        });

        // Pastki menyudagi tugmalar (LinearLayout lar)
        homeButton = findViewById(R.id.homeButton05);
        cartButton = findViewById(R.id.cartButton05);
        profileButton = findViewById(R.id.profileButton05);

        // Home bosilsa
//        homeButton.setOnClickListener(v -> {
//            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
//            startActivity(intent);
//            finish(); // o'zi ochilgan activity yana ochilmasin
//        });

        // Cart bosilsa
        cartButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, CartActivity.class);
            startActivity(intent);
        });

        // Profile bosilsa
        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}
