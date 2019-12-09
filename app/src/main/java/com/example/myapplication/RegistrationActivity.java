package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class RegistrationActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activity_registration);

    }
 public void processSignupLinkClick(View view) {
     Intent intent = new Intent(this, LoginActivity.class);
     startActivity(intent);
 }
}