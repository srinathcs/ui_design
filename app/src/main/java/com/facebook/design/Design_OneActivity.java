package com.facebook.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Design_OneActivity extends AppCompatActivity {
    private TextInputLayout textInputName;
    private TextInputLayout textInputSecondName;
    private TextInputLayout textInputDOB;
   // private TextInputLayout textInputEmail;
   // private TextInputLayout textInputDegree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_one);
        textInputName = findViewById(R.id.txt_1);
        textInputSecondName = findViewById(R.id.txt_2);
        textInputDOB = findViewById(R.id.txt_3);
       // textInputEmail = findViewById(R.id.edit_4);
        //textInputDegree = findViewById(R.id.edit_5);
        Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_1.setOnClickListener(this::submit);
                Toast.makeText(Design_OneActivity.this, "Hello World", Toast.LENGTH_LONG).show();
            }

            private boolean validatename() {
                String nameInput = textInputName.getEditText().getText().toString().trim();
                if (nameInput.isEmpty()) {
                    textInputName.setError("Enter The Name");
                    return false;
                } else {
                    textInputName.setError(null);
                    return true;
                }
            }

            private boolean validatesecondname() {
                String nameInputtwo = textInputSecondName.getEditText().getText().toString().trim();
                if (nameInputtwo.isEmpty()) {
                    textInputSecondName.setError("Enter the Second");
                    return false;
                } else {
                    textInputSecondName.setError(null);
                    return true;
                }
            }
            private boolean validateDOB(){
                String DOBinput = textInputDOB.getEditText().getText().toString().trim();
                if (DOBinput.isEmpty()){
                    textInputDOB.setError("Enter the DOB");
                    return false;
                }else{
                    textInputDOB.setError(null);
                    return true;
                }
            }
           /* private boolean validateEmail(){
                String EmailInput=textInputEmail.getEditText().getText().toString().trim();
                if (EmailInput.isEmpty()){
                    textInputEmail.setError("Enter the Email");
                    return false;
                }else{
                    textInputEmail.setError(null);
                    return true;
                }
            }
            private boolean validatedegree(){
                String degree=textInputDegree.getEditText().getText().toString().trim();
                if (degree.isEmpty()){
                    textInputDegree.setError("Enter the Degree");
                    return false;
                }else{
                    textInputDegree.setError(null);
                    return true;
                }
            }*/
            private void submit(View view){
                if (! validatename() | !validatesecondname() | !validateDOB()){ //|validateEmail()| !validatedegree()){
                    String data = textInputName.getEditText().getText().toString().trim() +"\n"+
                            textInputSecondName.getEditText().getText().toString().trim()+"\n"+
                            textInputDOB.getEditText().getText().toString().trim();

                }
            }
        });
    }
}



