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

    private String capitalize(String string)
    {
        int i = 0;
        do
        {
            string = string.substring(0, i) + Character.toUpperCase(string.charAt(i)) + string.substring(Integer.min(i + 1, string.length() - 1));
            int si = i = string.indexOf(' ', i + 1) + 1, di = string.indexOf('-', i + 1) + 1;

            if(i == 0) i = di;
            else if(di != 0) i = Integer.min(si, di);
        }
        while(i != 0 && i < string.length() - 1);
        return string;
    }
}
