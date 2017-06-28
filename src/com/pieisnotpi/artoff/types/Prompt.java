package com.pieisnotpi.artoff.types;

import com.pieisnotpi.artoff.ModifierIndex;

import java.util.ArrayList;
import java.util.List;

public class Prompt
{
    private List<ModifierIndex> modNouns = new ArrayList<>(), modAdjs = new ArrayList<>();
    private String prompt;

    public Prompt(String prompt)
    {
        this.prompt = prompt;
        String lower = prompt.toLowerCase();
        int i = 0;

        while((i = prompt.indexOf('[', i)) != -1)
        {
            if(lower.startsWith("noun", i + 1))
            {
                int end = prompt.indexOf(']', i), preI = prompt.indexOf(",pre", i), plurI = prompt.indexOf(",plural");
                modNouns.add(new ModifierIndex(prompt.substring(i, end + 1), Character.isUpperCase(prompt.charAt(i + 1)), (preI > 0 && preI < end), (plurI > 0 && plurI < end)));
                i+=6;
            }
            else if(lower.startsWith("adj", i + 1))
            {
                int end = prompt.indexOf(']', i), preI = prompt.indexOf(",pre", i);
                modAdjs.add(new ModifierIndex(prompt.substring(i, end + 1), Character.isUpperCase(prompt.charAt(i + 1)), (preI > 0 && preI < end), false));
                i+=5;
            }
        }
    }

    public String getFinalPrompt(List<Noun> nouns, List<Adjective> adjectives)
    {
        String temp = prompt;

        for(int i = 0; i < nouns.size(); i++) temp = modNouns.get(i).trim(temp, nouns.get(i));
        for(int i = 0; i < adjectives.size(); i++) temp = modAdjs.get(i).trim(temp, adjectives.get(i));

        return temp;
    }

    public int getNounCount()
    {
        return modNouns.size();
    }

    public int getAdjCount()
    {
        return modAdjs.size();
    }
}
