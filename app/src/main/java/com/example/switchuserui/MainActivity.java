package com.example.switchuserui;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sets up the button for switch one
        Button a = this.findViewById(R.id.switchA);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.a);
        a.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a note when the button for switch one is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp.start();
            }
        });

        Button b = this.findViewById(R.id.switchB);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.b);
        b.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a note when the button for switch three is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp1.start();
            }
        });

        Button c = this.findViewById(R.id.switchC);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.c);
        c.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a note when the button for switch three is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp2.start();
            }
        });

        Button d = this.findViewById(R.id.switchD);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.d);
        d.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a note when the button for switch four is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp3.start();
            }
        });

        Button play = this.findViewById(R.id.playButton);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.song);
        play.setOnClickListener(new View.OnClickListener(){

            /**
             * plays a song when the play button is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp4.start();
            }
        });

        Button pause = this.findViewById(R.id.pauseButton);
        pause.setOnClickListener(new View.OnClickListener(){

            /**
             * pauses a song when the pause button is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp4.pause();
            }
        });

        Button restart = this.findViewById(R.id.restartButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * restarts the song when the button is clicked
             * @param view the main activity layout
             */
            public void onClick(View view) {
                mp4.reset();
            }
        });

        //add accessibility features: text to speech, picture buttons
        //integrate bluetooth connectivity so that when the paired switch is on, the media player plays the note
    }
}
