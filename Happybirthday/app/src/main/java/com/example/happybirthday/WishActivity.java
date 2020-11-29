package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WishActivity extends AppCompatActivity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);
        Button mButton = findViewById(R.id.btn_finsh);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    Toast.makeText(getApplicationContext(), "祝你愿望成真", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "你以为结束了？\n再点一次试试", Toast.LENGTH_LONG).show();
                    count++;
                } else {
                    Intent intent = new Intent(WishActivity.this, VideoActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}