package com.example.shiv.portfolioapp;

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

        Button spotifyButton = (Button)findViewById(R.id.spotify_streamer_button);
        Button scoreButton = (Button)findViewById(R.id.score_app_button);
        Button libraryButton = (Button)findViewById(R.id.library_app_button);
        Button buildButton = (Button)findViewById(R.id.build_it_button);
        Button readerButton = (Button)findViewById(R.id.reader_button);
        Button capstoneButton = (Button)findViewById(R.id.capstone_button);

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the spotify app");
            }       
        });

        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the score app");
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the library app");
            }
        });

        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the build it bigger app");
            }
        });

        readerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the reader app");
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("This button will launch the capstone app");
            }
        });
    }

    private void makeToast(String text){
        Toast.makeText(getApplicationContext(), text , Toast.LENGTH_SHORT).show();
    }
}
