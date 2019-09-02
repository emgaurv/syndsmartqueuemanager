package com.syndsmartqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class branches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);

        //on production level data will be fetched according to geoLocation
        TextView cv1,cv2,cv3,cv4;
        cv1 = (TextView)findViewById(R.id.branch1);
        cv2 = (TextView)findViewById(R.id.branch2);
        cv3= (TextView)findViewById(R.id.branch3);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(branches.this, Dashboard.class);
                startActivity(i);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(branches.this, Dashboard.class);
                startActivity(i);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(branches.this, Dashboard.class);
                startActivity(i);
            }
        });
    }
}
