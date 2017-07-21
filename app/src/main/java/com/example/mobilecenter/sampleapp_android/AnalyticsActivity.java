package com.example.mobilecenter.sampleapp_android;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class AnalyticsActivity extends Fragment implements OnClickListener {
    private static final String pageName = "Analytics";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.analytics_root, container, false);

        Button eventButton = (Button) rootView.findViewById(R.id.customEventButton);
        eventButton.setOnClickListener(this);
        Button colorButton = (Button) rootView.findViewById(R.id.customColorButton);
        colorButton.setOnClickListener(this);
        return rootView;
    }

    public static AnalyticsActivity newInstance() {
        Bundle args = new Bundle();
        AnalyticsActivity fragment = new AnalyticsActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.customEventButton:
                DialogFragment eventDialog = new EventDialog();
                eventDialog.show(getFragmentManager(), "eventDialog");
                break;
            case R.id.customColorButton:
                DialogFragment colorDialog = new ColorDialog();
                colorDialog.show(getFragmentManager(), "colorDialog");
                break;
        }
    }

    public static class EventDialog extends DialogFragment {
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Event sent").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                }
            });
            return builder.create();
        }
    }


    public static class ColorDialog extends DialogFragment {
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            CharSequence[] colors = {"Yellow", "Blue", "Red"};
            builder.setTitle("Pick a color").setItems(colors, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int index) {
                    switch (index) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                }
            });
            return builder.create();
        }
    }

}

