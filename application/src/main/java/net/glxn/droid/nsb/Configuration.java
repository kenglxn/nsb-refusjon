package net.glxn.droid.nsb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * @author Ken Gullaksen
 */
public class Configuration extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuration);
    }

    public void onClick(View view) {
        throw new UnsupportedOperationException("not implemented");
    }
}