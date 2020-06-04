package com.example.dreamcatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button btnLogDream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogDream = findViewById(R.id.btnLogDream);
    }
    public void startLogDream(View v) {
        Intent intent = new Intent(this, LogDreamInfo.class);
        startActivity(intent);
    }



}
