package com.hyeran.android.broadcastreceiver;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. SDK 버전 체크
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkPermission();
        } else {
            init();
        }
    }

    private static final int REQ_PERM = 999;
    @TargetApi(Build.VERSION_CODES.M)
    private void checkPermission() {
        if(checkSelfPermission(Manifest.permission.RECEIVE_SMS) != PackageManager.PERMISSION_GRANTED
            || checkSelfPermission(Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED) {
            String perms[] = {Manifest.permission.RECEIVE_SMS, Manifest.permission.READ_SMS};
            requestPermissions(perms, REQ_PERM);
        } else {
            init();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == REQ_PERM) {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED
                    && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                init();
            } else {
                Toast.makeText(this, "SMS 사용 승인을 하셔야 앱이 정상적으로 동작합니다!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    private void init() {
//        Log.d("SMS", "checked permissions"); Log 안찍힐때는
        System.out.println("SMS:"+"checked permission");
    }
}
