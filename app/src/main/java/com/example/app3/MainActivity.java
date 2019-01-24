package com.example.app3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final int GALLERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonOpenAndConvert);

        //TODO: ПОДКЛЮЧАЙ МОКСИ!

        button.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }
}
