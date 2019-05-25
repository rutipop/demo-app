package com.example.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class third_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        final EditText editText = (EditText) findViewById(R.id.edit_text);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String curr_text = editText.getText().toString().trim();
                if(curr_text.length() == 5 && containsOnlyDigits(curr_text)){
                   go_to_main_with_number(curr_text);
                }



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }



    public void go_to_main_with_number (String curr_text ) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("entered_number", curr_text);
        setResult(RESULT_OK, intent);
        startActivity(intent);
        finish();
    }


    private static boolean containsOnlyDigits(final String value) {
        for (int i = 0; i < value.length(); i++) {
            if(!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
