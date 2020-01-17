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

public class SecondActivity extends AppCompatActivity {
private Button SecondToMain;
private Button test1;
private Button test2;
private Button test3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SecondToMain = (Button) findViewById(R.id.buttonSecondActivity);
        SecondToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View maView) {
                openMainActivity();
            }
        });

        test1 = (Button) findViewById(R.id.buttonTest1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View maView) {
                openTest1();
            }
        });

        test2 = (Button) findViewById(R.id.buttonTest2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View maView) {
                openTest2();
            }
        });

        test3 = (Button) findViewById(R.id.buttonTest3);
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View maView) {
                openTest3();
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

    public void openMainActivity(){
        Intent MonIntent = new Intent(this, MainActivity.class);
        startActivity(MonIntent);
        Log.i("info","Bouton enclencher");
    }

    public void openTest1(){
        Intent MonIntent = new Intent(this, Test11.class);
        startActivity(MonIntent);
        Log.i("info","Bouton enclencher");
    }

    public void openTest2(){
        Intent MonIntent = new Intent(this, Test2.class);
        startActivity(MonIntent);
        Log.i("info","Bouton enclencher");
    }

    public void openTest3(){
        Intent MonIntent = new Intent(this, Test3.class);
        startActivity(MonIntent);
        Log.i("info","Bouton enclencher");
    }
}
