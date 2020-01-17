package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Test3 extends AppCompatActivity {
    private Button MonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        MonButton = (Button) findViewById(R.id.button);


        MonButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View MaView){
                openActivity2();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void openActivity2(){
        Intent MonIntent = new Intent(this, SecondActivity.class);
        startActivity(MonIntent);
        Log.i("info","Bouton enclencher");
    }
}
