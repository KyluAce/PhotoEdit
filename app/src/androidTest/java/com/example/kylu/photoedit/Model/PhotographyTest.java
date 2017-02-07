package com.example.kylu.photoedit.Model;

import android.graphics.Bitmap;
import android.provider.ContactsContract;

import junit.framework.TestCase;

/**
 * Created by Krzysztof on 2015-06-15.
 */
public class PhotographyTest extends TestCase {
   // Photography photo =  Photography.getInstance();


    public void testPhotography(){
        assertNotNull(Photography.getInstance());
    }


  /*  public void testGetPhoto()
    {
        Bitmap bitmap = photo.getPhoto();
        assertNotNull(bitmap);
    }

    public void testGetCopy()
    {
        Bitmap bitmap = photo.getCopy();
        assertNotNull(bitmap);
    }
    public void testGetCopyFor()
    {

        Bitmap bitmap = photo.getCopyForSeeks();
        assertNotNull(bitmap);
    }   */


}