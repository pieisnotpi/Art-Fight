package com.pieisnotpi.artoff.types;

public class Noun extends Modifier
{
    private String noun;

    public Noun(String noun)
    {
        prefix = (int) noun.charAt(2) - 48;
        this.noun = noun.substring(4);
    }

    public String getString()
    {
        return noun;
    }
}
