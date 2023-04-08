package com.example.calctext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etX = findViewById(R.id.txt1);
        EditText etY = findViewById(R.id.txt2);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    ResultActivity.class);
            intent.putExtra("firsted", etX.getText().toString());
            intent.putExtra("seconded", etY.getText().toString());
            startActivity(intent);
        });
    }
}