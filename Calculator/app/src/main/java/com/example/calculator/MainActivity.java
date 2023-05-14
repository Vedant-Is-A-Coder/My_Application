package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText text1;
    EditText text2;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.buttonadd);
        text1 = (EditText) findViewById(R.id.noone);
        text2 = (EditText) findViewById(R.id.notwo);
        ans = (TextView) findViewById(R.id.answer);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.length() > 0 && text2.length() > 0 ) {
                    int addedSum = Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString());
                    ans.setText("result is =" + Integer.toString(addedSum));
                }
            }
        });
    }
}