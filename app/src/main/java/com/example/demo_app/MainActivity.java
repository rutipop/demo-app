package com.example.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go_fish_button = (Button) findViewById(R.id.go_fish);
        TextView go_to_third = (TextView) findViewById(R.id.tap_on_me);


        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                go_to_third.setText(extras.getString("entered_number"));
            }
        }


        go_fish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gofishhh();

            }
        });

        go_to_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotothird();

            }
        });


    }


    public void gotothird(){
        Intent intent = new Intent(this, third_screen.class);
        startActivity(intent);
    }


    public void gofishhh(){
        Intent intent = new Intent(this, fishing.class);
        startActivity(intent);
    }
}
