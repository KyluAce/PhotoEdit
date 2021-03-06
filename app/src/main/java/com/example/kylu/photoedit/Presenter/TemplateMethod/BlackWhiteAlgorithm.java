package com.example.kylu.photoedit.Presenter.TemplateMethod;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;


public class BlackWhiteAlgorithm extends AbstractAlgorithm
{

    protected Bitmap getAlgorithm(Bitmap b){

        getCoop(b);
        Bitmap bmpGrayscale = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmpGrayscale);
        Paint paint = new Paint();
        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
        paint.setColorFilter(f);
        c.drawBitmap(b, 0, 0, paint);
        return bmpGrayscale;
    };


}
