package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//method to invoke login
/* methods to invoke
LoginActivity
 */
public class LoginActivity extends AppCompatActivity
{

    protected void onCreate(@Nullable Bundle x)
    {
        super.onCreate(x);
        setContentView(R.layout.activity_login);
        final EditText etusername=findViewById(R.id.editText1);
        final EditText etpassword=findViewById(R.id.editText2);
        Button btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username=etusername.getText().toString();
                String password=etpassword.getText().toString();

                if(username.equals("username")&& password.equals("password"))
                {
                   // Intent intent=new Intent(getApplicationContext(), W.class);

                   //startActivity(intent);


                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid credentials",Toast.LENGTH_LONG).show();


                }














            }
        });

    }

    public void processSignupLinkClick(View view)
    {
    // Intent intent=new Intent(this, RegistrationActivity.class);
    // startActivity(intent);

    }
}