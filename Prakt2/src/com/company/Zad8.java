package com.company;

public class Zad8 {
    public static boolean isStrangePair(String str1, String str2)
    {
        if (str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length()-1) == str2.charAt(0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
