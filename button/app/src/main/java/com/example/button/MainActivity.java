package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnButton;
    TextView txtTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnButton = findViewById(R.id.button);
        txtTextView = findViewById(R.id.text);

        btnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtTextView.setText("Button Clicked");
                txtTextView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
            }
        });
    }
}