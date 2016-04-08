package com.udacity.burhan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_spotifyStreamer, button_scoresApp, button_libraryApp, button_buildItBigger, button_xyzReader, button_capstone;
        button_spotifyStreamer = (Button)findViewById(R.id.button_spotifyStreamer);
        button_scoresApp = (Button)findViewById(R.id.button_scoresApp);
        button_libraryApp = (Button)findViewById(R.id.button_libraryApp);
        button_buildItBigger = (Button)findViewById(R.id.button_buildItBigger);
        button_xyzReader = (Button)findViewById(R.id.button_xyzReader);
        button_capstone = (Button)findViewById(R.id.button_capstone);

        button_spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();
            }
        });

        button_scoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        button_libraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Library App", Toast.LENGTH_SHORT).show();
            }
        });

        button_buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Build It Bigger", Toast.LENGTH_SHORT).show();
            }
        });

        button_xyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader", Toast.LENGTH_SHORT).show();
            }
        });

        button_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Capstone: My Own App", Toast.LENGTH_SHORT).show();
            }
        });

    }



}
