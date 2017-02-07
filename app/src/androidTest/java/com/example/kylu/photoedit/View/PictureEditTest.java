package com.example.kylu.photoedit.View;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kylu.photoedit.Model.Photography;
import com.example.kylu.photoedit.Presenter.Strategy.ShareContext;
import com.example.kylu.photoedit.Presenter.TemplateMethod.AbstractAlgorithm;
import com.example.kylu.photoedit.Presenter.TemplateMethod.BlackWhiteAlgorithm;
import com.example.kylu.photoedit.Presenter.TemplateMethod.BlurAlgorithm;
import com.example.kylu.photoedit.Presenter.TemplateMethod.NegatywAlgoritthm;
import com.example.kylu.photoedit.Presenter.TemplateMethod.SepiaAlgoritm;
import com.example.kylu.photoedit.R;

import junit.framework.TestCase;

/**
 * Created by Krzysztof on 2015-06-14.
 */
public class PictureEditTest extends TestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();

    }

    public void testPhotography() {
        assertNotNull(Photography.getInstance());
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }


    public void testPreconditions() {
        PictureEdit pictureEdit = new PictureEdit();
        assertNotNull("Nie istnieje dana aktywnosc", pictureEdit);
    }


   /* public void testImageViewNotNull2() {
        PictureEdit pictureEdit = new PictureEdit();

        ImageView Picture = (ImageView) pictureEdit.findViewById(R.id.Pic);
        assertNotNull(Picture);
    } */

    public void testBWAlgorithm()

    {
        AbstractAlgorithm bw = new BlackWhiteAlgorithm();
        assertNotNull(bw);
    }
    public void testSepiaAlgorithm()

    {
        AbstractAlgorithm sepia = new SepiaAlgoritm();
        assertNotNull(sepia);
    }
    public void testNegatywAlgorithm()

    {
        AbstractAlgorithm negatyw = new NegatywAlgoritthm();
        assertNotNull(negatyw);
    }
    public void testBlurAlgorithm()

    {
        AbstractAlgorithm blur = new BlurAlgorithm();
        assertNotNull(blur);
    }

    public void testSharing()
    {
        ShareContext share = new ShareContext();
        assertNotNull(share);
    }



  /*  public void testButtonBW()
    {
        PictureEdit pictureEdit = new PictureEdit();
        ImageButton BW  = (ImageButton) pictureEdit.findViewById(R.id.imageButtonBlackWhite);
        assertNotNull(BW);
    } */


}