package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import com.example.ex_4.R;

public class MainActivity extends AppCompatActivity {


    private final int splash_length = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable()    {
            @Override
            public void run()   {

                Intent mainIntent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, splash_length);
    }

}