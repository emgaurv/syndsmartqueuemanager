package com.syndsmartqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class otpconfirmation extends AppCompatActivity {
    TextView optdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpconfirmation);
        Button btn = (Button) findViewById(R.id.login_next);

        optdata = (TextView) findViewById(R.id.otpconfirm);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opt = optdata.getText().toString();
                //static auth will replaced with server auth in production level
                if (opt.length() == 0) {
                    Toast.makeText(otpconfirmation.this, "OTP is not valid", Toast.LENGTH_LONG).show();

                } else {
                    Intent i = new Intent(otpconfirmation.this, branches.class);
                    startActivity(i);
                }

            }
        });
    }
}
