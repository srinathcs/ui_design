package com.facebook.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;


public class DesignActivity extends AppCompatActivity {
    private TextInputLayout tilName,tilSecondName,tilDOB;
    private TextInputLayout tilEmail;
    private TextInputLayout tilDegree;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        initViews();
        setupEvent();
    }

    private void initViews(){
        tilName = findViewById(R.id.tilName);
        tilSecondName = findViewById(R.id.tilSecondName);
        tilDOB = findViewById(R.id.tilDOB);
        tilEmail = findViewById(R.id.tilEmail);
        tilDegree = findViewById(R.id.tilDegree);
        btnSubmit = findViewById(R.id.btnSubmit);
    }

    private void setupEvent(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSubmit();
                Toast.makeText(DesignActivity.this, "Hello World", Toast.LENGTH_LONG).show();
            }
        });
    }

    private boolean isValidateName() {
        String nameInput = tilName.getEditText().getText().toString().trim();
        if (nameInput.isEmpty()) {
            tilName.setError("Enter The Name");
            return false;
        } else {
            tilName.setError(null);
            return true;
        }
    }

    private boolean isValidateSecondName() {
        String nameInputTwo = tilSecondName.getEditText().getText().toString().trim();
        if (nameInputTwo.isEmpty()) {
            tilSecondName.setError("Enter the Last Name");
            return false;
        } else {
            tilSecondName.setError(null);
            return true;
        }
    }
    private boolean isValidateDOB(){
        String DOBInput = tilDOB.getEditText().getText().toString().trim();
        if (DOBInput.isEmpty()){
            tilDOB.setError("Enter the DOB");
            return false;
        }else{
            tilDOB.setError(null);
            return true;
        }
    }
    private boolean isValidateEmail(){
        String EmailInput= tilEmail.getEditText().getText().toString().trim();
        if (EmailInput.isEmpty()){
            tilEmail.setError("Enter the Email");
            return false;
        }else{
            tilEmail.setError(null);
            return true;
        }
    }
    private boolean isValidateDegree(){
        String degree= tilDegree.getEditText().getText().toString().trim();
        if (degree.isEmpty()){
            tilDegree.setError("Enter the Degree");
            return false;
        }else{
            tilDegree.setError(null);
            return true;
        }
    }
    private void onSubmit(){
        if (! isValidateName() | !isValidateSecondName() | !isValidateDOB() | isValidateEmail()| !isValidateDegree()){
            String data = tilName.getEditText().getText().toString().trim() +"\n"+
                    tilSecondName.getEditText().getText().toString().trim()+"\n"+
                    tilDOB.getEditText().getText().toString().trim()+"\n"+
                    tilEmail.getEditText().getText().toString().trim()+"\n"+
                    tilDegree.getEditText().getText().toString().trim();

        }
    }
}



