package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Navigation extends AppCompatActivity implements View.OnClickListener {

    Button btnLeaderboardNav, btnRulesNav, btnRewardsNav, btnAboutusNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        btnLeaderboardNav = findViewById(R.id.btnLeaderboardNav);
        btnRulesNav = findViewById(R.id.btnRulesNav);
        btnRewardsNav = findViewById(R.id.btnRewardsNav);
        btnAboutusNav = findViewById(R.id.btnAboutusNav);

        btnLeaderboardNav.setOnClickListener(this);
        btnRulesNav.setOnClickListener(this);
        btnRewardsNav.setOnClickListener(this);
        btnAboutusNav.setOnClickListener(this);

    }

    @Override
    public void onClick (View v){

        if (v == btnLeaderboardNav) {
            openActivity2();
        }

        if (v == btnRulesNav) {
            openActivity3();
        }

        if (v == btnRewardsNav) {
            openActivity4();
        }

        if (v == btnAboutusNav) {
            openActivity5();
        }

    }

    public void openActivity2(){
        Intent intent = new Intent(this, Leaderboard.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, rules.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, rewards.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, aboutus.class);
        startActivity(intent);
    }



}
