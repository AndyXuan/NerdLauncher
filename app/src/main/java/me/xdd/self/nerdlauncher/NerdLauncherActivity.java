package me.xdd.self.nerdlauncher;

import android.support.v4.app.Fragment;
import me.xdd.self.nerdlauncher.fragment.NerdLauncherFragment;

public class NerdLauncherActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newFragment();
    }
}
