package com.pieisnotpi.artoff;

import com.pieisnotpi.artoff.types.Modifier;

public class ModifierIndex
{
    private boolean capitalize, usePrefixes;
    private String unparsed;

    public ModifierIndex(String unparsed, boolean capitalize, boolean usePrefixes)
    {
        this.unparsed = unparsed;
        this.capitalize = capitalize;
        this.usePrefixes = usePrefixes;
    }

    public String trim(String prompt, Modifier modifier)
    {
        String prefix = usePrefixes ? Main.PREFIXES.get(modifier.getPrefix()) : "", mod = modifier.getString();
        int start = prompt.indexOf(unparsed), end = start + unparsed.length();

        if(prefix.length() > 1 && start == 0) prefix = Character.toUpperCase(prefix.charAt(0)) + prefix.substring(1);
        if(capitalize) mod = capitalize(mod);
        if(start == 0) return prefix + mod + prompt.substring(end);
        else return prompt.substring(0, start) + prefix + mod + prompt.substring(end);
    }

    private String capitalize(String toCapitalize)
    {
        String temp = toCapitalize;
        int i = 0;
        do
        {
            temp = temp.substring(0, i) + Character.toUpperCase(temp.charAt(i)) + temp.substring(i + 1);
            int si = temp.indexOf(' ', i + 1) + 1, di = temp.indexOf('-', i + 1) + 1;
            if(si == 0) i = di;
            else if(di > 0) i = Integer.min(si, di);
            else i = si;
        }
        while(i != 0);
        return temp;
    }
}
