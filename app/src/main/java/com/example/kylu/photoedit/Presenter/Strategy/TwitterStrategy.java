package com.example.kylu.photoedit.Presenter.Strategy;

/**
 * Created by Krzysztof on 2015-06-10.
 */
public class TwitterStrategy extends ShareContext implements ShareStrategy
{
    public String typeOfNetworks (){
        String typeOfNetwork = "twitter";
        return typeOfNetwork;
    };
}
