package com.syndsmartqueue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BranchFreePredictFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //This Fragment has Dummy Data for now, on production level Data will be fetched from server algorithms
        return inflater.inflate(R.layout.fragment_branch_free_predict, null);
    }
}