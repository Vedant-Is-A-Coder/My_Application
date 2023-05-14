package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox minecraft,apex,pubg,valo,terraria;
    private Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minecraft = (CheckBox) findViewById(R.id.minecraft);
        apex = (CheckBox) findViewById(R.id.apex);
        pubg = (CheckBox) findViewById(R.id.pubg);
        valo = (CheckBox) findViewById(R.id.valo);
        terraria = (CheckBox) findViewById(R.id.terraria);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "Games You Play";
                if(minecraft.isChecked()){
                    str+=minecraft;
                }
                if(apex.isChecked()){
                    str+=apex;
                }
                if(pubg.isChecked()){
                    str+=pubg;
                }
                if(valo.isChecked()){
                    str+=valo;
                }
                if(terraria.isChecked()){
                    str+=terraria;
                }
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });
    }
}