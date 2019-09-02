package com.syndsmartqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class branchcleanessfeedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branchcleanessfeedback);
Button submit_feedback = (Button)findViewById(R.id.submit_feedback);

//feedbacks will be sent to central server on production level
        submit_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(branchcleanessfeedback.this, Dashboard.class);
                Toast.makeText(branchcleanessfeedback.this, "Feedback Sent", Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });

    }
}
