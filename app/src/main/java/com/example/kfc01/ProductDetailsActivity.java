package com.example.kfc01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    private int quantity = 0; // Boshlanish qiymati 0

    private TextView textQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        ImageView productImage = findViewById(R.id.detail_image);
        TextView productName = findViewById(R.id.detail_name);
        TextView productDescription = findViewById(R.id.detail_description);
        TextView productPrice = findViewById(R.id.detail_price);

        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        textQuantity = findViewById(R.id.text_quantity);

        // Intentdan ma'lumotlarni olish
        int imageResId = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        String price = getIntent().getStringExtra("price");

        // Ma'lumotlarni ko‘rsatish
        if (imageResId != 0) {
            productImage.setImageResource(imageResId);
        }
        productName.setText(name);
        productDescription.setText(description);
        productPrice.setText("Narxi: " + price);

        // "+" tugmasi bosilganda
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                updateQuantity();
            }
        });

        // "-" tugmasi bosilganda
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity > 0) {
                    quantity--;
                    updateQuantity();
                }
            }
        });

        // Boshlang‘ich quantity ko‘rsatish
        updateQuantity();
    }

    private void updateQuantity() {
        textQuantity.setText(String.valueOf(quantity));
    }
}
