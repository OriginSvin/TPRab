package com.company;

public class Zad1 {

    public static String repeat (String str,int a)
    {
        String t="";
        int b = str.length();
        for (int i=0;i<b;i++)
        {
            for (int j=0;j<a;j++)
            {
                t=t+str.charAt(i);
            }

        }

        return t;
    }
}
