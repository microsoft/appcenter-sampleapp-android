package ms.appcenter.sampleapp.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BuildActivity extends Fragment {
    private static final String pageName = "Build";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.build_root, container, false);
        return rootView;
    }

    public static BuildActivity newInstance() {
        Bundle args = new Bundle();
        BuildActivity fragment = new BuildActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public static CharSequence getPageName() {
        return pageName;
    }
}
