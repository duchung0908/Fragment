package com.example.fragmenthw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class FullImage extends Activity {
    ImageView img;
    String link;
    public void returnHome(View view){
        Intent intent = new Intent(getApplication(), com.example.fragmenthw.MainActivity.class);
        intent.putExtra("history", link);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_full);
        Intent intent = getIntent();
        link = intent.getExtras().getString("link");
        img = findViewById(R.id.imageView);
        Picasso.get().load(link).resize(1200,1000).into(img);
    }
}