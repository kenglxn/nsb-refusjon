package net.glxn.droid.nsb.test;

import android.test.ActivityInstrumentationTestCase2;
import net.glxn.droid.nsb.NSBRefusjon;

public class NSBRefusjonTest extends ActivityInstrumentationTestCase2<NSBRefusjon> {

    public NSBRefusjonTest() {
        super(NSBRefusjon.class);
    }

    public void testActivity() {
        NSBRefusjon activity = getActivity();
        assertNotNull(activity);
    }
}

