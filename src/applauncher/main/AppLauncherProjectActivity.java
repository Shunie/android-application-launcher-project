package applauncher.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AppLauncherProjectActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        TextView mainView = new TextView(this);
        setContentView(mainView);
        mainView.setText("Hello world!");
    }
}