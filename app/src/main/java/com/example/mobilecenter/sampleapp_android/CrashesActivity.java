package com.example.mobilecenter.sampleapp_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CrashesActivity extends Fragment {
    private static final String pageName = "Crashes";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.crashes_root, container, false);
        return rootView;
    }

    public static CrashesActivity newInstance() {
        Bundle args = new Bundle();
        CrashesActivity fragment = new CrashesActivity();
        fragment.setArguments(args);
        return fragment;
    }
}
