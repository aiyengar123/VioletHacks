package com.example.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLoginHome, btnSignupHome, button;
    EditText edtTxtUsernameHome, edtTxtPasswordHome;

    @Override
    public void onClick (View v) {

        if (v == btnSignupHome) {
            //UserModel userModel = new UserModel(edtTxtUsernameHome.getText().toString(), edtTxtPasswordHome.getText().toString());
            //Toast.makeText(MainActivity.this, userModel.toString(), Toast.LENGTH_SHORT).show();

            openActivity2();

        }
//        if (v == btnLoginHome) {
//
//
//            DataBase dataBaseHelper = new DataBase(MainActivity.this);
//            List<UserModel> everyone = dataBaseHelper.getEveryone();
//            UserModel test = new UserModel("John", "password123");
//            dataBaseHelper.addOne(test);
//
//
//
//            for (int i = 0; i < everyone.size(); i++) {
//                if (everyone.get(i).getUsername().equals(edtTxtUsernameHome.getText().toString()) && (everyone.get(i).getPassword().equals(edtTxtPasswordHome.getText().toString()))) {
//                    //Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
//                } else {
//                    //Toast.makeText(MainActivity.this, "ACCESS DENIED", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//
//        }
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            btnLoginHome = findViewById(R.id.btnLoginHome);
            btnSignupHome = findViewById(R.id.btnSignupHome);
            edtTxtUsernameHome = findViewById(R.id.edtTxtUsernameHome);
            edtTxtPasswordHome = findViewById(R.id.edtTxtPasswordHome);

            Toast.makeText(MainActivity.this, "HELLO!", Toast.LENGTH_SHORT).show();

            btnLoginHome.setOnClickListener(this);
            btnSignupHome.setOnClickListener(this);
            edtTxtUsernameHome.setOnClickListener(this);
            edtTxtPasswordHome.setOnClickListener(this);

        }

        public void openActivity2 () {
            Intent intent = new Intent(this, Navigation.class);
            startActivity(intent);
        }

        public void openActivity3 () {
            Intent intent = new Intent(this, signup.class);
            startActivity(intent);
        }



}
