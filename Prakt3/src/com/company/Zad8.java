package com.company;

public class Zad8 {

    public static String longestZero(String str)
    {
        String[] str1 = str.split("1");

        String res = "";
        for (String str2 : str1) // для каждого элемента
        {
            if (str2.length() > res.length())
            {
                res = str2;
            }
        }

        return res;
    }

}
