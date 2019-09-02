package com.syndsmartqueue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class purposeofvisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purposeofvisit);

        LinearLayout deposit = (LinearLayout) findViewById(R.id.cashdeposit);
        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(purposeofvisit.this, withdrawform.class);
                startActivity(i);
            }
        });
//in production lever other processes will be added for now only deposit working
        LinearLayout atm = (LinearLayout) findViewById(R.id.atm);
        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(purposeofvisit.this, "Only Deposit Service Available for now", Toast.LENGTH_SHORT).show();

            }
        });
        LinearLayout check = (LinearLayout) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(purposeofvisit.this, "Only Deposit Service Available for now", Toast.LENGTH_SHORT).show();

            }
        });
        LinearLayout other = (LinearLayout) findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(purposeofvisit.this, "Only Deposit Service Available for now", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
