package com.example.kfc01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    private LinearLayout homeButton, cartButton, profileButton;
    private Button startOrdersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        startOrdersButton = findViewById(R.id.button17);

        startOrdersButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(CartActivity.this);
            builder.setMessage("Hurmatli mijoz, buyurtmangiz tayyorlanmoqda, 15 minutda tayyor bo'ladi!");
            builder.setPositiveButton("OK", (dialog, which) -> {
                dialog.dismiss();
            });
            builder.setCancelable(false);
            AlertDialog dialog = builder.create();
            dialog.show();
        });

        homeButton = findViewById(R.id.homeButton04);
        cartButton = findViewById(R.id.cartButton04);
        profileButton = findViewById(R.id.profileButton04);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this, HomeActivity.class);
            startActivity(intent);
            finish(); // Orqadagi activityni yopish uchun
        });

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this, ProfileActivity.class);
            startActivity(intent);
            finish();
        });

//        cartButton.setOnClickListener(v -> {
//            Toast.makeText(CartActivity.this, "Siz hozir Savatda turibsiz", Toast.LENGTH_SHORT).show();
//        });
    }
}
