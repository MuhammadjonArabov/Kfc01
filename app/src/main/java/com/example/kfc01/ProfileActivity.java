package com.example.kfc01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private LinearLayout homeButton, profileButton, cartButton;
    private Button myReviewsButton, accountSettingsButton, personalInfoButton, notificationButton, fingerprintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Buttonlar
        myReviewsButton = findViewById(R.id.button);
        accountSettingsButton = findViewById(R.id.button2);
        personalInfoButton = findViewById(R.id.button3);
        notificationButton = findViewById(R.id.button4);
        fingerprintButton = findViewById(R.id.button5);

        // My Reviews
        myReviewsButton.setOnClickListener(v -> {
            final String[] cities = {"Toshkent", "Namangan"};
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setTitle("Shahar tanlang")
                    .setSingleChoiceItems(cities, -1, (dialog, which) -> {
                        // Optionally tanlangan shahar bilan ishlasa bo'ladi
                    })
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });

        // Account Settings
        accountSettingsButton.setOnClickListener(v -> {
            final String[] languages = {"Ingliz", "Rus", "O'zbek"};
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setTitle("Til tanlang")
                    .setSingleChoiceItems(languages, -1, (dialog, which) -> {
                        // Optionally tanlangan til bilan ishlasa bo'ladi
                    })
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });

        // Personal Information
        personalInfoButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setMessage("Ismingiz: Jon Dne\nEmailingiz: ali@gmail.com\nJami xarid: 37 ta\nJami summa: 23,400$\nKeshbek: 123$")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });

        // Notification
        notificationButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setMessage("Mahsulotlarga 20% chegirma ketyapti. Ulguring!")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });

        // Fingerprint Settings
        fingerprintButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setMessage("Barmoq izini olish uchun 5 sekund bosib turing.")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });

        fingerprintButton.setOnLongClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
            builder.setMessage("Barmoq izi muvaffaqiyatli almashtirildi.")
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
            return true;
        });

        // Bottom Navigation tugmalari
        homeButton = findViewById(R.id.homeButton03);
        profileButton = findViewById(R.id.profileButton03);
        cartButton = findViewById(R.id.cartButton03);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

//        profileButton.setOnClickListener(v -> {
//            Toast.makeText(ProfileActivity.this, "Siz hozir Profile sahifasidasiz", Toast.LENGTH_SHORT).show();
//        });

        cartButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, CartActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
