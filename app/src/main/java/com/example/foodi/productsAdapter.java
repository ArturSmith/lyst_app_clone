package com.example.foodi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.ProductHolder> {

    private List<Product> products = new ArrayList<>();

    public void setProducts(List<Product> products) {
        this.products = products;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.product_card_item,
                parent,
                false
        );
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ProductHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView price;
        private final TextView brand;
        private final TextView description;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageViewProduct);
            price = itemView.findViewById(R.id.textViewProductPrice);
            brand = itemView.findViewById(R.id.textViewProductBrand);
            description = itemView.findViewById(R.id.textViewProductDescription);
        }
    }
}
