package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import android.view.View;

public class number4 extends Activity {
private SoundPool mySound;
    int redaudioId;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this,R.raw.four,1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.four);
        mp.start();
    }

    public void toword4(View view) { Integer[] integers = NumberRandomiser.getRandomNumbers();
        Intent intent = new Intent(getApplicationContext(), NumberRandomiser.class);
        intent.putExtra("number",integers[0]);
        startActivity(intent);
    }
    public void slimz(View v) {
        mySound.play(redaudioId, 1, 1, 1, 0, 1);  }
}
