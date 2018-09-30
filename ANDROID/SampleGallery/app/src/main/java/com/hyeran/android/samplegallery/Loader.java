package com.hyeran.android.samplegallery;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;

public class Loader {

    public static List<String> getGalleryItem(Context context) {
        List<String> data = new ArrayList<>();

        ContentResolver resolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String projs[] = {MediaStore.Images.Media.DATA};
        // 실제로 앱에 적용할 때는 썸네일 주소를 불러와서 사용
        Cursor cursor = resolver.query(uri, projs, null, null, null);
        if(cursor != null) {
            while(cursor.moveToNext()) {
                String imagePath = cursor.getString(0);
                // 하나만 가져오므로 index 0
                data.add(imagePath);
            }
        }

        return data;
    }
}
