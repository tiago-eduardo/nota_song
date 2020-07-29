package com.example.nota_song;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button creditos = findViewById(R.id.buttonCreditos);

        Intent intent = new Intent(getApplicationContext(),Creditos.class);
        startActivity(intent);
    }
}