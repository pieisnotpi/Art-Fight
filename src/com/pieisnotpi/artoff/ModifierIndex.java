package com.pieisnotpi.artoff;

import com.pieisnotpi.artoff.types.Modifier;

public class ModifierIndex
{
    private boolean capitalize, usePrefixes, isPlural;
    private String unparsed;

    public ModifierIndex(String unparsed, boolean capital, boolean prefixes, boolean plural)
    {
        this.unparsed = unparsed;
        capitalize = capital;
        usePrefixes = prefixes;
        isPlural = plural;
    }

    public String trim(String prompt, Modifier modifier)
    {
        String prefix = usePrefixes ? Main.PREFIXES.get(modifier.getPrefix()) : "", mod = capitalize ? capitalize(modifier.getString(isPlural)) : modifier.getString(isPlural);
        int start = prompt.indexOf(unparsed), end = start + unparsed.length();

        if(prefix.length() > 1 && start == 0) prefix = capitalize(prefix);
        return start == 0 ? prefix + mod + prompt.substring(end) : prompt.substring(0, start) + prefix + mod + prompt.substring(end);
    }

    private String capitalize(String toCapitalize)
    {
        String temp = toCapitalize;
        int i = 0;
        do
        {
            temp = temp.substring(0, i) + Character.toUpperCase(temp.charAt(i)) + temp.substring(Integer.min(i + 1, temp.length() - 1));
            int si = temp.indexOf(' ', i + 1) + 1, di = temp.indexOf('-', i + 1) + 1;
            if(si == 0) i = di;
            else if(di > 0) i = Integer.min(si, di);
            else i = si;
        }
        while(i != 0 && i < temp.length() - 1);
        return temp;
    }
}
