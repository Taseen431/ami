package com.example.ami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView left=findViewById(R.id.left_icon);
        ImageView right=findViewById(R.id.right_icon);
        TextView text=findViewById(R.id.toolbar);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Left", Toast.LENGTH_SHORT).show();

            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();

            }
        });

            text.setText("Ami pari na");
    }
}