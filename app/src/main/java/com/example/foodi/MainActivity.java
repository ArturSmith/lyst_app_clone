package com.example.foodi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductsAdapter productsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        productsAdapter = new ProductsAdapter();
        recyclerView.setAdapter(productsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        viewModel.loadProducts();
        viewModel.getProducts().observe(this, products -> productsAdapter.setProducts(products));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerViewMA);
    }
}