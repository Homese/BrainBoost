package com.example.dwayne.conglemerate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class frown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frown);
        Toast.makeText(getApplicationContext(), "Click back to Return", Toast.LENGTH_SHORT).show();
    }
    public void takeback(View view) {
        Intent intent =new Intent(getApplicationContext(),ex1.class);
        startActivity(intent);
}
}
