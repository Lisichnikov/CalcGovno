package com.example.calctext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etX = findViewById(R.id.txt1);
    EditText etY = findViewById(R.id.txt2);
    TextView result = findViewById(R.id.rese);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String strX = etX.getText().toString();
        String strY = etY.getText().toString();

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        String sum = Integer.toString(x+y);
        result.setText(sum);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        MainActivity.this,
                        ResultActivity.class);
                intent.putExtra("resultat", result.getText());
                startActivity(intent);
            }
        });
    }
}