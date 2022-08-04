package com.facebook.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Design_OneActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_one);
        editText = (EditText) findViewById(R.id.edit_1);
        Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Design_OneActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                EditText edittext = (EditText) findViewById(R.id.edit_1);
                if (edittext.getText().length() == 0) {
                    edittext.setError("Enter Your Name");
                }
            }

        });
    }
}








