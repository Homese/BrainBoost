package com.example.dwayne.conglemerate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Numbers();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentA)
                .addToBackStack(null)
                .commit();
    }

    public void btnnumber(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentF = new  Exercises();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent,fragmentF)
                .addToBackStack(null)
                .commit();
    }

    public void results(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentB = new Smile();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentB)
                .addToBackStack(null)
                .commit();
    }

    public void btncele(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentE = new Celebration();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent,fragmentE)
                .addToBackStack(null)
                .commit();
    }

    public void redbtn(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentC = new Frown();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentC)
                .addToBackStack(null)
                .commit();
    }

    public void backbtn(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentD = new Exercises();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent,fragmentD)
                .addToBackStack(null)
                .commit();

    }

}