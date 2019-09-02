package com.syndsmartqueue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class withdrawform extends AppCompatActivity {
EditText x10,x50,x100,x200,x500,x2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawform);
        Button draw = (Button) findViewById(R.id.widrae);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("WITHDRAWSESSION", MODE_PRIVATE).edit();
                editor.putString("drawsession", "yes");
                // editor.putInt("idName", 12);
                editor.apply();
                Toast.makeText(withdrawform.this, "Queue Registered, Check Dashboard", Toast.LENGTH_LONG).show();

                Intent i = new Intent(withdrawform.this, Dashboard.class);
                startActivity(i);
            }
        });
    }
}
