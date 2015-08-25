package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ex1 extends Activity {
    SoundPool mySound;
    private MediaPlayer mp;
    int ferId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        ferId = mySound.load(this,R.raw.showmethree,1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.showmethree);
        mp.start();
    }
    /**
     * Buttons to take the user to another activity(Pass or Failure)
     * */
    public void rested(View view) { Intent intent = new Intent(getApplicationContext(),smile.class);
        startActivity(intent);
    }
    public void wrongchoice(View view) { Intent intent = new Intent(getApplicationContext(),frown.class);
        startActivity(intent);
    }
    public void lunz(View view) {
    }
}