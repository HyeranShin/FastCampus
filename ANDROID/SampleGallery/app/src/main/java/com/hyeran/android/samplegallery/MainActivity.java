package com.hyeran.android.samplegallery;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int GALLERY = 999;
    public static final int PERM = 998;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkVersion();
    }

    private void checkVersion() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {    // M: 마시멜로
            checkPermission();
        } else {
            init();
        }
    }

    private void checkPermission() {
        if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERM);
        } else {
            init();
        }
    }

    private void init() {
        imageView = findViewById(R.id.imageView);
        findViewById(R.id.btnGallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 갤러리 호출
//                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                Intent intent = new Intent(getBaseContext(), GalleryActivity.class);
                startActivityForResult(intent, GALLERY);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK) {
            switch (requestCode) {
                case GALLERY:
                    String imagePath = data.getStringExtra(GalleryActivity.IMAGEPATH);
                    Uri imageUri = Uri.parse(imagePath);
                    imageView.setImageURI(imageUri);
                    break;
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == PERM) {
            for (int grant : grantResults) {
                if(grant != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "권한 요청을 승인해야 앱을 사용할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                }
            }
            init();
        }
    }
}
