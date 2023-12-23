package com.example.mobileandroid_native;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class sign_in3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in3);
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setPaintFlags(textView7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}