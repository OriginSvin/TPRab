package com.company;

public class Zad4 {
    public static String flipEndChars(String str)
    {
        String str1;
        char c1 = str.charAt(0);
        char c2 = str.charAt(str.length()-1);
        if (str.length() < 2)
        {
            str1 = "Несовместимо.";
        }
        else {
            if (c1 == c2) {
                str1 = "Два - это пара.";
            }
            else
            str1 = c2 + str.substring(1, str.length() - 1) + c1;
        }
        return str1;
    }
}
