package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ex1 extends Activity  {
    SoundPool mySound;
    private MediaPlayer mp;
    int ferId;
    Button buttonOnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        ferId = mySound.load(this, R.raw.showmethree, 1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.showmethree);
        mp.start();
        Button b1 = (Button)findViewById(R.id.rightbutton);
        Button b2 =(Button)findViewById(R.id.wrongbutton);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getApplicationContext(), smile.class);
                                      startActivity(intent);
                                  }
                              }     // default method for handling onClick Events..
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),frown.class);
                startActivity(intent1);
            }
        });

    }
    /**
     * Buttons to take the user to another activity(Pass or Failure)
     */




    public void lunz(View view) {
        mySound.play(ferId, 1, 1, 1, 0, 1);
    }


}