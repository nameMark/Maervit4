package com.example.maervit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Onas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
