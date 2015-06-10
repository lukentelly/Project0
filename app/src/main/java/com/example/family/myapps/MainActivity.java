// Aaron Luke First App for Project Zero
// Last Mod: 06/09/15

package com.example.family.myapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // creating and binding buttons
        final Button button1 = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);

        // invoking onClicks for each button
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "Spotify Streamer App Here!", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "Scores App Here!", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "Library App Here!", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "Build it Bigger App Here!", Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "Bacon Reader App Here!", Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display Toast Message
                Toast.makeText(getApplicationContext(), "CAPSTONE App Here!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}

