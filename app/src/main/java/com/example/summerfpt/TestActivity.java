package com.example.summerfpt;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_login);
    }
    private void handleClickButton(View view) {
        EditText name = findViewById(R.id.edt_id);
        String myName = name.getText().toString().trim();
        if(TextUtils.isEmpty(myName)) {
            Toast.makeText(this, "Your name cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        String message = "Hello" + myName + "Welcome to My App";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
