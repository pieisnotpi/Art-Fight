package com.pieisnotpi.artoff.types;

public abstract class Modifier
{
    protected int prefix;

    public int getPrefix()
    {
        return prefix;
    }

    public abstract String getString();
}
