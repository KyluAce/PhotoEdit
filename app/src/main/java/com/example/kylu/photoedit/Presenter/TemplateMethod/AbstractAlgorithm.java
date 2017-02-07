package com.example.kylu.photoedit.Presenter.TemplateMethod;

import android.graphics.Bitmap;


public abstract class AbstractAlgorithm {

    protected int width;
    protected int height;

    abstract protected Bitmap getAlgorithm(Bitmap b);

    public void getCoop(Bitmap b) {

        height = b.getHeight();
        width = b.getWidth();
    }

    public Bitmap calculate(Bitmap b){
        return getAlgorithm(b);
    }




}
