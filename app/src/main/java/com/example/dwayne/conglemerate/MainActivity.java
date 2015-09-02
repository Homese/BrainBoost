package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
public void results(View v){
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentA = new Numbers();
    fragmentManager.beginTransaction()
            .replace(R.id.mainContent, fragmentA)
            .addToBackStack(null)
            .commit();
}
    public void wrongchoice(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Numbers();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentA)
                .addToBackStack(null)
                .commit();
    }
    public void click(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Exercises();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentA)
                .addToBackStack(null)
                .commit();
    }
}