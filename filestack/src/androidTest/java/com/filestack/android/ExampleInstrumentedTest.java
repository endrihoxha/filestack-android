package com.filestack.android;

import static androidx.test.InstrumentationRegistry.getTargetContext;
import static androidx.test.platform.app.InstrumentationRegistry.*;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = getTargetContext();

        assertEquals("com.filestack.android.test", appContext.getPackageName());
    }
}
