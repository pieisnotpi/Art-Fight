package com.pieisnotpi.artoff.types;

public class Noun extends Modifier
{
    private String noun, nounPlural;

    public Noun(String n)
    {
        prefix = (int) n.charAt(2) - (int) '0';
        int i = n.indexOf(',');
        if(i > 0)
        {
            noun = n.substring(4, i);
            nounPlural = n.substring(i + 1);
        }
        else noun = nounPlural = n.substring(4);
    }

    public String getString(boolean isPlural)
    {
        return isPlural ? nounPlural : noun;
    }
}
