package com.example.dwayne.conglemerate;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class number4 extends Activity {
SoundPool mySound;
    int fourId;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);

        Button numberfour = (Button) findViewById(R.id.button4);
    numberfour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO Auto generated method stub
            Intent intent = new Intent(number4.this,ex1.class);
            startActivity(intent);
        }
    });}

    public void slimz(View view) {mySound.play(fourId, 1, 1, 1, 0, 1);
    }
}






