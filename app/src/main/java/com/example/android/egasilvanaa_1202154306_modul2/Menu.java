package com.example.android.egasilvanaa_1202154306_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Coconut Delight");
            foods.add("Berry Pancake");
            foods.add("Strawberry Cheesecake");
            foods.add("Chocolate Trufle");
            foods.add("Pancake Oreo");

            priceses.add(20000);
            priceses.add(25000);
            priceses.add(27500);
            priceses.add(35000);
            priceses.add(22000);

            photos.add(R.drawable.a);
            photos.add(R.drawable.b);
            photos.add(R.drawable.c);
            photos.add(R.drawable.d);
            photos.add(R.drawable.d);
        }
    }
}
