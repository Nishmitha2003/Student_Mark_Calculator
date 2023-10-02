package com.example.experiment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button enterMarksButton = (Button) findViewById(R.id.enterMarksButton);
        enterMarksButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, EnterMarks.class);
                        startActivity(i);
                    }
                }
        );

        Button viewMarksButton = (Button) findViewById(R.id.viewAllMarksButton);
        viewMarksButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent i = new Intent(MainActivity.this, ViewMarks.class);
                        startActivity(i);
                    }
                }
        );
    }
}
