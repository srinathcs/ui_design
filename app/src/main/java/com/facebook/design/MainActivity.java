package com.facebook.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeActivityBtn = findViewById(R.id.btn_1);
        Button changeActivityBtn_2 = findViewById(R.id.btn_2);
        Button changeActivityBtn_3 = findViewById(R.id.btn_3);
        Button changeActivityBtn_4 = findViewById(R.id.btn_4);
        changeActivityBtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
        changeActivityBtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        changeActivityBtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        changeActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });


    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent =new  Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}

