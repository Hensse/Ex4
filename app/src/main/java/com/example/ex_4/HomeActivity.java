package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    Button nappi;
    EditText ed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.nappi = findViewById(R.id.nappi);
        this.ed = findViewById(R.id.editText);

        this.nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ed.isEnabled())  {
                    ed.setEnabled(false);
                }
                else    {
                    ed.setEnabled(true);
                }
            }
        });
    }
}
