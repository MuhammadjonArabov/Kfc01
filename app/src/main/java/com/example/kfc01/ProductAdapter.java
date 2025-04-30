package com.example.kfc01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    private LayoutInflater inflater;
    private int layout;
    private List<Product> products;

    public ProductAdapter(Context context, int resource, List<Product> products) {
        super(context, resource, products);
        this.layout = resource;
        this.products = products;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        ImageView image = view.findViewById(R.id.product_image);
        TextView name = view.findViewById(R.id.product_name);
        TextView price = view.findViewById(R.id.product_price);

        Product product = products.get(position);

        image.setImageResource(product.getImageResource());
        name.setText(product.getName());
        price.setText(product.getPrice());

        return view;
    }
}
