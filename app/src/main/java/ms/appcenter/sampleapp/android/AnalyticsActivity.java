package ms.appcenter.sampleapp.android;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.microsoft.appcenter.analytics.Analytics;

import java.util.HashMap;
import java.util.Map;

public class AnalyticsActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.analytics_root, container, false);

        Button eventButton = rootView.findViewById(R.id.customEventButton);
        eventButton.setOnClickListener(view -> {
            DialogFragment eventDialog = new EventDialog();
            eventDialog.show(getFragmentManager(), "eventDialog");
        });

        Button colorButton = rootView.findViewById(R.id.customColorButton);
        colorButton.setOnClickListener(view -> {
            DialogFragment colorDialog = new ColorDialog();
            colorDialog.show(getFragmentManager(), "colorDialog");
        });
        return rootView;
    }

    public static class EventDialog extends DialogFragment {
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            Analytics.trackEvent("Sample event");
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Event sent").setPositiveButton("OK", (dialog, id) -> {
                // Insert any code here that you want triggered by the Click Event
            });
            return builder.create();
        }
    }

    public static class ColorDialog extends DialogFragment {
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            CharSequence[] colors = {"Yellow", "Blue", "Red"};
            builder.setTitle("Pick a color").setItems(colors, (dialog, index) -> {
                Map<String, String> properties = new HashMap<>();
                switch (index) {
                    case 0:
                        properties.put("Color", "Yellow");
                        break;
                    case 1:
                        properties.put("Color", "Blue");
                        break;
                    case 2:
                        properties.put("Color", "Red");
                        break;
                }
                Analytics.trackEvent("Color event", properties);

            });
            return builder.create();
        }
    }
}

