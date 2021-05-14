package com.asmaamir.facedentifier.About;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX;

import com.asmaamir.facedentifier.R;

public class AboutActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_PERMISSION = 101;
    public static final String[] REQUIRED_PERMISSIONS = new String[]{"android.permission.CAMERA"};
    private TextureView tv;
    private ImageView iv;
    private static final String TAG = "RealTimeObjectDetectionActivity";

    public static CameraX.LensFacing lens = CameraX.LensFacing.BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}