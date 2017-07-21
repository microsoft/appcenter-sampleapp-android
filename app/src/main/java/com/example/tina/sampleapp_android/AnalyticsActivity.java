package com.example.tina.sampleapp_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AnalyticsActivity extends Fragment {
    private static final String pageName = "Analytics";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.analytics_root, container, false);
        return rootView;
    }

    public static AnalyticsActivity newInstance() {
        Bundle args = new Bundle();
        AnalyticsActivity fragment = new AnalyticsActivity();
        fragment.setArguments(args);
        return fragment;
    }
}

