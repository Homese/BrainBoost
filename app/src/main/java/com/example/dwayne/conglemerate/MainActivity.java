package com.example.dwayne.conglemerate;

import android.content.Intent;
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
    public void switchFRagments(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Exercises();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragmentA)
                .addToBackStack(null)
                .commit();
    }
    public void click(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmentA = new Numbers();
        fragmentManager.beginTransaction().hide(fragmentA)
                .replace(R.id.mainContent, fragmentA)
                .commit();
        Intent intent = new Intent(this.getApplicationContext(),Numbers.class);
        startActivity(intent);
    }
}