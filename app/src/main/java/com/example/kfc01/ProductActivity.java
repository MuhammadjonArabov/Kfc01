package com.example.kfc01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {
    private List<Product> products = new ArrayList<>();
    private ListView productsList;
    private LinearLayout homeButton, profileButton, cartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        setInitialData();

        productsList = findViewById(R.id.productsList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item_product, products);
        productsList.setAdapter(adapter);

        productsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product selected = products.get(position);

                Intent intent = new Intent(ProductActivity.this, ProductDetailsActivity.class);
                intent.putExtra("name", selected.getName());
                intent.putExtra("description", selected.getDescription());
                intent.putExtra("image", selected.getImageResource());
                intent.putExtra("price", selected.getPrice());
                intent.putExtra("category", selected.getCategory());

                startActivity(intent);
            }
        });

        homeButton = findViewById(R.id.homeButton01);
        profileButton = findViewById(R.id.profileButton01);
        cartButton = findViewById(R.id.cartButton01);

        // Home bosilsa
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        // Profile bosilsa
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        // Cart bosilsa
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setInitialData() {
        products.add(new Product("Chicken Burger", "Mazali tovuqli burger", R.drawable.product_image1, "$5.99", "Burger"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image2, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image4, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image5, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image6, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image7, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image8, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image9, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image10, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image11, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image12, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image13, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image14, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image15, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image16, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image17, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image18, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image19, "$2.99", "Snacks"));
        products.add(new Product("French Fries", "Qovurilgan kartoshka", R.drawable.product_image20, "$2.99", "Snacks"));
    }
}
