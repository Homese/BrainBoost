package com.example.dwayne.conglemerate;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class number2 extends AppCompatActivity {

    private SoundPool mySound;
    int twoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        twoId = mySound.load(this,R.raw.two,1);
    }

    public void twoloud(View view) {
        Intent intent = new Intent(getApplicationContext(),Show_me_one.class);
        startActivity(intent);
    }
}
