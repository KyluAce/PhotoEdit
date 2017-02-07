package com.example.kylu.photoedit.View;

import android.Manifest;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.example.kylu.photoedit.Model.Photography;
import com.example.kylu.photoedit.R;

import junit.framework.TestCase;

/**
 * Created by Krzysztof on 2015-06-13.
 */
public class EditableTest extends ActivityInstrumentationTestCase2<Editable> {
        Editable editable;


    @LargeTest
    public void testWritePermission() {
        String permission = Manifest.permission.WRITE_EXTERNAL_STORAGE;
        assertEquals("android.permission.WRITE_EXTERNAL_STORAGE", permission);
    }

    public void testPhotography(){
        assertNotNull(Photography.getInstance());
    }

    @LargeTest
    public void testCamera() {
        String permission = Manifest.permission.CAMERA;
        assertEquals("android.permission.CAMERA", permission);
    }

    @LargeTest
    public void testWrite() {
        String permission = Manifest.permission.WRITE_SETTINGS;
        assertEquals("android.permission.WRITE_SETTINGS", permission);
    }

    @LargeTest
    public void testCreditals() {
        String permission = Manifest.permission.USE_CREDENTIALS;
        assertEquals("android.permission.USE_CREDENTIALS", permission);
    }

    @LargeTest
    public void testAccounts() {
        String permission = Manifest.permission.GET_ACCOUNTS;
        assertEquals("android.permission.GET_ACCOUNTS", permission);
    }

    @LargeTest
    public void testInternet() {
        String permission = Manifest.permission.INTERNET;
        assertEquals("android.permission.INTERNET", permission);
    }

    @LargeTest
    public void testReadPermission() {
        String permission = Manifest.permission.READ_EXTERNAL_STORAGE;
        assertEquals("android.permission.READ_EXTERNAL_STORAGE", permission);
    }

    public EditableTest() {
        super(Editable.class);
    }

    public void testPreconditions() {
        assertNotNull("Nie istnieje dana aktywnosc", editable);
    }


    @Override
    public void setUp() throws Exception {
        super.setUp();

        editable = getActivity();
    }

    public void testButtonSaveNotNull(){
        Button save = (Button) editable.findViewById(R.id.Save);
        assertNotNull(save);
    }

    public void testImageViewNotNull(){
        ImageView Picture = (ImageView) editable.findViewById(R.id.Pic);
        assertNotNull(Picture);
    }
    public void testSeekBarNotNull(){
        SeekBar seekBarBrightness = (SeekBar) editable.findViewById(R.id.jasnosc);
        assertNotNull(seekBarBrightness);
    }




}