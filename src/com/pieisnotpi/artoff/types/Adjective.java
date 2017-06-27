package com.pieisnotpi.artoff.types;

public class Adjective extends Modifier
{
    private String adjective;

    public Adjective(String adjective)
    {
        prefix = (int) adjective.charAt(2) - 48;
        this.adjective = adjective.substring(4);
    }

    public String getString()
    {
        return adjective;
    }
}
