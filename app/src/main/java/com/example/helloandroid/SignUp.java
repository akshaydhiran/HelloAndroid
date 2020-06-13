package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {
    TextInputEditText regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button regBtn, regToLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        regName = findViewById(R.id.reg_name);
        regUsername = findViewById(R.id.reg_username);
        regEmail = findViewById(R.id.reg_email);
        regPhoneNo = findViewById(R.id.reg_phoneNo);
        regPassword = findViewById(R.id.reg_password);
        regBtn = findViewById(R.id.reg_btn);

        regToLoginBtn = findViewById(R.id.reg_login_btn);
    }
    public void registerUser(View view) {

        String name,username,email,password,phoneNo;
        name = regName.getText().toString();
        username= regUsername.getText().toString();
        email = regEmail.getText().toString();
        password = regPassword.getText().toString();
        phoneNo = regPhoneNo.getText().toString();

        if (TextUtils.isEmpty(name))
        {
            regName.setError("Enter Your Name");
            return;
        }
        if (TextUtils.isEmpty(email))
        {
            regEmail.setError("Enter Your Email");
            return;
        }
        if (TextUtils.isEmpty(phoneNo))
        {
            regPhoneNo.setError("Enter Your Password");
            return;
        }
        if (TextUtils.isEmpty(password))
        {
            regPassword.setError("Enter Your Password Again");
            return;
        }
        Intent intent = new Intent(getApplicationContext(), VerifyPhoneNo.class);
        intent.putExtra("phoneNo", phoneNo);
        startActivity(intent);

    }
}