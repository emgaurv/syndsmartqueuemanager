package com.syndsmartqueue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QueueRegister extends AppCompatActivity {
    public final static String MESSAGE_KEY ="message_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_register);

     //   Button skipProcess = (Button)findViewById(R.id.skipProcess);
      /*  skipProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QueueRegister.this, Dashboard.class);
                i.putExtra(MESSAGE_KEY,"Skip");
                startActivity(i);
            }
        });*/
        Button pov = (Button)findViewById(R.id.purpose1);
        SharedPreferences prefs = getSharedPreferences("WITHDRAWSESSION", MODE_PRIVATE);
        String session = prefs.getString("drawsession", "na");

        if(session == "yes"){
            pov.setVisibility(View.INVISIBLE);
        }
        pov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QueueRegister.this, purposeofvisit.class);
                startActivity(i);
            }
        });
    }
}
