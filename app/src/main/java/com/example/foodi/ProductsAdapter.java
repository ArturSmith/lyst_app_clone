package com.example.foodi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductHolder> {

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
        Product product = products.get(position);
        Glide.with(holder.itemView)
                .load(product.getImage())
                .into(holder.image);
        holder.price.setText(product.getPrice());
        holder.title.setText(product.getTitle());
        holder.description.setText(product.getDescription());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ProductHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView price;
        private final TextView title;
        private final TextView description;


        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageViewProduct);
            price = itemView.findViewById(R.id.textViewProductPrice);
            title = itemView.findViewById(R.id.textViewProductBrand);
            description = itemView.findViewById(R.id.textViewProductDescription);
        }
    }
}
