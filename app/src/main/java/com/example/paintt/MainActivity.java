package com.example.paintt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.kyanogen.signatureview.SignatureView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    SignatureView signatureView;
    ImageButton imgEraser, imgColor, imgSave;
    SeekBar seekBar;
    TextView txtPenSize;

    private static String filename;
    File path = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/myPaintings");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signatureView = findViewById(R.id.signature_view);
        seekBar = findViewById(R.id.penSize);
        txtPenSize = findViewById(R.id.txtPenSize);
        imgColor = findViewById(R.id.btnColor);
        imgEraser = findViewById(R.id.btnEraser);
        imgSave = findViewById(R.id.btnSave);
        
        askPermission();
    }

    private void askPermission() {
    }
}