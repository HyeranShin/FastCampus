package com.hyeran.android.samplegallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class GalleryActivity extends AppCompatActivity implements GalleryAdapter.Callback{

    public static final String IMAGEPATH = "image";
    RecyclerView recyclerView;
    GalleryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        recyclerView = findViewById(R.id.recyclerView);
        List<String> data = Loader.getGalleryItem(this);
        adapter = new GalleryAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        adapter.setDataAndRefresh(data);
    }

    @Override
    public void returnPath(String imagePath) {
        Intent intent = new Intent();
        intent.putExtra(IMAGEPATH, imagePath);
        setResult(RESULT_OK, intent);
        finish();
    }
}
