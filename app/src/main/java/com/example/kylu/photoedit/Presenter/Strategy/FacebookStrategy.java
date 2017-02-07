package com.example.kylu.photoedit.Presenter.Strategy;

/**
 * Created by Krzysztof on 2015-06-10.
 */
public class FacebookStrategy extends ShareContext implements ShareStrategy
{
    public String typeOfNetworks ()
    {
        String typeOfNetwork = "facebook";
        return typeOfNetwork;
    };
}

