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

    } public void click(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Exercises();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentA)
                .addToBackStack(null)
                .commit();
    }

    public void results(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentB = new Smile();
        fragmentManager.beginTransaction()
                .replace(R.id.exml, fragmentB)
                .addToBackStack(null)
                .commit();
    }

    public void btnend(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentE = new Celebration();
        fragmentManager.beginTransaction()
                .replace(R.id.correct,fragmentE)
                .addToBackStack(null)
                .commit();
    }



    public void redbtn(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentC = new Frown();
        fragmentManager.beginTransaction()
                .replace(R.id.exml, fragmentC)
                .addToBackStack(null)
                .commit();

    }

public void backbtn(View view){
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentD = new Exercises();
    fragmentManager.beginTransaction()
            .replace(R.id.frown,fragmentD)
            .addToBackStack(null)
            .commit();
}

}




