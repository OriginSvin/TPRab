package com.company;

public class Zad5 {

    public static int getDecimalPlaces(String str)
    {
        int a=0;
        String[] s = str.split(",");
        if (s.length>1) {
            a = s[1].length();
            return a;
        }
        else return 0;
    }
}
