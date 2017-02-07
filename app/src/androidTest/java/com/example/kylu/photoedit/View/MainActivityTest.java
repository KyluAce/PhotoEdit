package com.example.kylu.photoedit.View;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by Krzysztof on 2015-06-14.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        mainActivity = getActivity();
    }

    public void testPreconditions3()
    {
        assertNotNull("Nie istnieje dana aktywnosc", mainActivity);
    }




}