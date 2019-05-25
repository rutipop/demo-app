package com.example.demo_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fishing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing);
    }

    @Override
    public void onBackPressed(){
        finish();
    }

}
