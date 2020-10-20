package com.company;

public class Zad7 {

    public static boolean isValid (String str)
    {
        if (str.length() != 5)
        {
            return false;
        }

        for (int i = 0; i < 5; i++)
        {
            if (str.codePointAt(i) < '0' || str.codePointAt(i) > '9')
            {
                return false;
            }
        }

        return true;

    }
}
