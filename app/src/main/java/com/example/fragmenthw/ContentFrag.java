package com.example.fragmenthw;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.fragment.app.Fragment;

public class ContentFrag extends Fragment {
    GridView gridView;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_frag, container, false);
        gridView = view.getRootView().findViewById(R.id.gridview);
        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            String a =adapterView.getItemAtPosition(i).toString();
            Intent intent = new Intent(view.getContext(), com.example.fragmenthw.FullImage.class);
            intent.putExtra("link", a);
            startActivity(intent);
        });
        return view;
    }

    public void updateContent(int position){
        switch (position){
            case 0:
                gridView.setAdapter(new ImageAdapter(getContext(), getResources().getStringArray(R.array.flowers)));
                break;
            case 1:
                gridView.setAdapter(new ImageAdapter(getContext(), getResources().getStringArray(R.array.animals)));
                break;
            case 2:
                gridView.setAdapter(new ImageAdapter(getContext(), getResources().getStringArray(R.array.foods)));
                break;
        }
    }
}