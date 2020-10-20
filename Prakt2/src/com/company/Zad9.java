package com.company;

public class Zad9 {
    public static boolean isSuffix(String word, String str)
    {
        str = str.substring(1);
        if (word.endsWith(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isPrefix(String word, String str)
    {
        str = str.substring(0, str.length()-1);
        if (word.startsWith(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
