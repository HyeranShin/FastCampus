package com.hyeran.android.samplegallery;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.Holder>{
    List<String> data = new ArrayList<>();  // 이미지 경로
    Callback callback;
    public GalleryAdapter(Callback callback) {
        this.callback = callback;
    }

    public void setDataAndRefresh(List<String> data){
        this.data = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String imagePath = data.get(position);
        holder.setImage(imagePath);
        holder.imagePath = imagePath;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface Callback {
        public void returnPath(String imagePaht);
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView gridItem;
        String imagePath;
        public Holder(View itemView) {
            super(itemView);
            gridItem = itemView.findViewById(R.id.gridItem);
            gridItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.returnPath(imagePath);
                }
            });
        }
        public void setImage(String imagePath) {
            Uri uri = Uri.parse(imagePath);
            gridItem.setImageURI(uri);
        }
        public void setImage(Uri imageUri) {
            gridItem.setImageURI(imageUri);
        }
    }
}
