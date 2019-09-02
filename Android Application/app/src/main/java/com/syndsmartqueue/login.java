package com.syndsmartqueue;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import studio.carbonylgroup.textfieldboxes.TextFieldBoxes;

public class login extends AppCompatActivity {
    String accountnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button) findViewById(R.id.login_next);
        final EditText accountno = (EditText) findViewById(R.id.accountno);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getting a/c no from edittext
                accountnumber = accountno.getText().toString();

                if(accountnumber.length() == 0){
                    Toast.makeText(login.this, "Account Number is not valid", Toast.LENGTH_LONG).show();
                }else{
                    //showing OTP
                    sendNotification();
                    //saving account no in local memeory, replaced with database on production level
                    SharedPreferences.Editor editor = getSharedPreferences("ACCOUNTNO", MODE_PRIVATE).edit();
                    editor.putString("accountnoretrive", accountnumber);
                    // editor.putInt("idName", 12);
                    editor.apply();
                    Intent i = new Intent(login.this, otpconfirmation.class);
                    Toast.makeText(login.this, "OTP: 1947", Toast.LENGTH_LONG).show();
                    startActivity(i);
                }
            }
        });
    }

    //Showing OTP via Notification in Prototype, On Production level SMS services will be used
    public void sendNotification() {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.icon)
                        .setContentTitle("SYND Smart Queue OTP")
                        .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                        .setContentText("Your OTP is: 1947");
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE
                );
        mNotificationManager.notify(001, mBuilder.build());
    }

}
