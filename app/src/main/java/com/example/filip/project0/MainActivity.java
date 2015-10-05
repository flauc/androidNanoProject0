package com.example.filip.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickSpotify(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my spotify app", Toast.LENGTH_SHORT).show();
    }

    public void clickScores(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my scores app", Toast.LENGTH_SHORT).show();
    }

    public void clickLibrary(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my library app", Toast.LENGTH_SHORT).show();
    }

    public void clickBuild(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
    }

    public void clickXyz(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my xyz reader app", Toast.LENGTH_SHORT).show();
    }

    public void clickCapstone(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
    }
}
