package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class number4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
    }
    public void toword4(View view) {
        Intent intent = new Intent(getApplicationContext(),ex1.class);
        startActivity(intent);
    }
}
