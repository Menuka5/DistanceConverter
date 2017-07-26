package com.hsenid.android.distanceconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText kmText = (EditText) findViewById(R.id.kmText);
        final EditText mileText = (EditText) findViewById(R.id.milesText);
        Button kmToMileBtn = (Button) findViewById(R.id.kmToMilesBtn);
        Button mileToKmBtn = (Button) findViewById(R.id.MilesToKmBtn);

        kmToMileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String km = kmText.getText().toString();
                if (!km.matches("")){
                    float kmCount = Float.parseFloat(km);
                    mileText.setText( Double.toString((kmCount* 0.621371)));
                }
            }
        });

        mileToKmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String miles = mileText.getText().toString();
                if (!miles.matches("")){
                    float mileCount = Float.parseFloat(miles);
                    kmText.setText( Double.toString((mileCount* 1.60934)));
                }
            }
        });

    }
}
