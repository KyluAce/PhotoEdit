package com.example.kylu.photoedit.View;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.example.kylu.photoedit.R;

import junit.framework.TestCase;

/**
 * Created by Krzysztof on 2015-06-13.
 */
public class ChoiceActivityTest extends ActivityInstrumentationTestCase2<ChoiceActivity> {

    ChoiceActivity choiceActivity;

    public void testGetPath() throws Exception
    {
    }
    @Override
    public void setUp() throws Exception {
        super.setUp();

        choiceActivity = getActivity();
    }

    public ChoiceActivityTest () {super(ChoiceActivity.class);}

    public void testPreconditions() {
        assertNotNull("Nie istnieje dana aktywnosc", choiceActivity);
    }

    public void testGetGalleryNotNull(){
        ImageView getGallery = (ImageView)choiceActivity.findViewById(R.id.imageGalleryChoice);
        assertNotNull(getGallery);
    }

    public void testTakePictureNotNull(){
        ImageView takePicture = (ImageView)choiceActivity.findViewById(R.id.imageCameraChoice);
        assertNotNull(takePicture);
    }
}