package com.example.tina.sampleapp_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GeneralActivity extends Fragment {
    private static final String pageName = "General";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.general_root, container, false);
        return rootView;
    }

    public static GeneralActivity newInstance() {
        Bundle args = new Bundle();
        GeneralActivity fragment = new GeneralActivity();
        fragment.setArguments(args);
        return fragment;
    }
}
