package com.syndsmartqueue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


public class HomeFragment extends Fragment {

    ImageView openToken;
    ImageView cancel;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        SharedPreferences prefs = getActivity().getSharedPreferences("WITHDRAWSESSION", MODE_PRIVATE);
        String session = prefs.getString("drawsession", "na");

        if(session == "yes"){

             view = inflater.inflate(R.layout.fragment_home,
                    container, false);
            openToken = (ImageView) view.findViewById(R.id.viewToken);
            cancel = (ImageView) view.findViewById(R.id.cancelQueue);
            openToken.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent i = new Intent(getActivity(), QueueRegister.class);
                    startActivity(i);
                }
            });
            cancel.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    SharedPreferences.Editor editor = getActivity().getSharedPreferences("WITHDRAWSESSION", MODE_PRIVATE).edit();
                    editor.putString("drawsession", "na");
                    editor.apply();
                    Intent intent = getActivity().getIntent();
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    getActivity().finish();
                    startActivity(intent);

/*
                    Intent i = new Intent(getActivity(), Dashboard.class);
                    startActivity(i);*/
                }
            });

        }else{
            view = inflater.inflate(R.layout.dashboard2,
                    container, false);
        }


        return view;
    }}