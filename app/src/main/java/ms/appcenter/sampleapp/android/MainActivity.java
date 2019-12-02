package ms.appcenter.sampleapp.android;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;


public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    private final Fragment[] views = {
            new WelcomeActivity(),
            new BuildActivity(),
            new TestActivity(),
            new DistributeActivity(),
            new CrashesActivity(),
            new AnalyticsActivity(),
            new PushActivity()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        // Initialize SDK
        if (!BuildConfig.APPCENTER_APP_SECRET.equals("")) {
            // Use APPCENTER_APP_SECRET environment variable if it exists
            AppCenter.start(getApplication(), BuildConfig.APPCENTER_APP_SECRET,
                    Analytics.class, Crashes.class, Distribute.class);
        } else {
            // Otherwise use the hardcoded string value here
            AppCenter.start(getApplication(), "<APP SECRET HERE>",
                    Analytics.class, Crashes.class, Distribute.class);
        }


        if (BuildConfig.DEBUG) {
            AppCenter.setLogLevel(Log.VERBOSE);
        }

        // UI Elements
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(@IntRange(from = 0, to = 6) final int position) {
            return views[position];
        }

        @Override
        public int getCount() {
            return views.length;
        }

        @Override
        public CharSequence getPageTitle(@IntRange(from = 0, to = 6) final int position) {
            if (views[position] instanceof WelcomeActivity) {
                return "Welcome";
            } else if (views[position] instanceof BuildActivity) {
                return "Build";
            } else if (views[position] instanceof TestActivity) {
                return "Test";
            } else if (views[position] instanceof DistributeActivity) {
                return "Distribute";
            } else if (views[position] instanceof CrashesActivity) {
                return "Crashes";
            } else if (views[position] instanceof AnalyticsActivity) {
                return "Analytics";
            } else if (views[position] instanceof PushActivity) {
                return "Push";
            }

            return views[position].getClass().getSimpleName().trim().replace("Activity", "");
        }
    }
}