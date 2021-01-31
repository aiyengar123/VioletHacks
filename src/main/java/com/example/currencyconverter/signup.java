package com.example.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity implements View.OnClickListener{

    Button btnSignupSignup;
    EditText edtTxtUsernameSignup, edtTxtEmailSignup, edtTxtPasswordSignup, edtTxtConfirmpasswordSignup;

    @Override
    public void onClick (View v){

        if (v == btnSignupSignup) {
            UserModel userModel = new UserModel("Bob", "testing2day");

            //Toast.makeText(signup.this, edtTxtUsernameSignup.getText().toString(), Toast.LENGTH_SHORT).show();

//            String value=edtTxtUsernameSignup.getText().toString();
//            Intent intent = new Intent(signup.this, MainActivity.class);
//            intent.putExtra("username",value);
//            startActivity(intent);

            DataBase dataBaseHelper = new DataBase(signup.this);
            boolean yes = dataBaseHelper.addOne(userModel);
            Toast.makeText(signup.this, "Success!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignupSignup = findViewById(R.id.btnSignupSignup);

    }
}
