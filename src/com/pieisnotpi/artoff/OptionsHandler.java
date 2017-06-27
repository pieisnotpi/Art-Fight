package com.pieisnotpi.artoff;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionsHandler
{
    private final static boolean writeToDisk = true;

    public static List<String> getStrings(String path, String defaultValues)
    {
        File f = new File(path);
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        if(f.exists()) try { scanner = new Scanner(new File(path)); } catch(IOException e) { scanner = new Scanner(defaultValues); }
        else { writeString(f, defaultValues); scanner = new Scanner(defaultValues); }

        while(scanner.hasNextLine())
        {
            String t = scanner.nextLine();
            if(t.contains("#")) t = t.substring(0, t.indexOf('#'));
            if(t.length() != 0) strings.add(t);
        }

        return strings;
    }

    private static void writeString(File file, String string)
    {
        if(!writeToDisk) return;

        try(PrintWriter writer = new PrintWriter(file)) { writer.println(string); }
        catch(IOException e) { System.err.println("Cannot save values to disk. Program will continue to function, but will not be customizable"); e.printStackTrace(); }
    }
}
