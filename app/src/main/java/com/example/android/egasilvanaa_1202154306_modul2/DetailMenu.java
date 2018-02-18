package com.example.android.egasilvanaa_1202154306_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailMenu extends AppCompatActivity {

    TextView tvfood, tvprice;
    ImageView ivphoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tvfood = (TextView)findViewById(R.id.tvFood);
        tvprice = (TextView)findViewById(R.id.tvPrice);
        ivphoto = (ImageView)findViewById(R.id.imgPhoto);

        tvfood.setText(food);
        tvprice.setText("Rp. "+price);
        ivphoto.setImageResource(photo);
    }
}

