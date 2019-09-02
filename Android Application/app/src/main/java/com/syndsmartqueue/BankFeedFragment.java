package com.syndsmartqueue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BankFeedFragment extends Fragment {
    Button s1,s2,s3,s4,r1,r2,r3,r4;



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bank_feed,
                container, false);
        //Hardcoded buttons/ads for Feed Ads, It will be replaced with RecyclerView


        s1 = (Button) view.findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        s2 = (Button) view.findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        s3 = (Button) view.findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        s4 = (Button) view.findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        r1 = (Button) view.findViewById(R.id.r1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        r2 = (Button) view.findViewById(R.id.r2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        r3 = (Button) view.findViewById(R.id.r3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        r4 = (Button) view.findViewById(R.id.r4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callToast();
            }
        });
        return view;
    }
    public void callToast(){
        Toast.makeText(getActivity(), "This Action not allowed in Prototype.", Toast.LENGTH_SHORT).show();
    }
}




