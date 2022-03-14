package com.example.fragmenthw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements com.example.fragmenthw.MenuFrag.IFragmentClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onMenuItemClick(int position) {
        ContentFrag contentFrag =
                (ContentFrag)getSupportFragmentManager().findFragmentById(R.id.ContentFrag);
        if(contentFrag != null){
            contentFrag.updateContent(position);
        }
    }

}