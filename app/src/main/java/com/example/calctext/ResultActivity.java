package com.example.calctext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView answer = findViewById(R.id.output);
        try {
            String etX = getIntent().getExtras().getString("firsted");
            String etY = getIntent().getExtras().getString("seconded");
            int stY = Integer.parseInt(etY);
            int result = (Integer.parseInt(etX) + (Integer.parseInt(etY)));
            if (stY > 0) {
                answer.setText(etX + " + " + etY + " = " + result);
            } else {
                answer.setText(etX + " + " + "(" + etY + ")" + " = " + result);
            }
        }catch (NumberFormatException e){
            answer.setText("Ты дурак, иди попу нюхай!");
        }
    }
}