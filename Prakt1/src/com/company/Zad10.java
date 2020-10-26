package com.company;

public class Zad10 {
    public static boolean abcmath(int a, int b, int c)
    {
        boolean bool=false;
        for(int i=1;i<=b;i++)
            a++;
        if((a%c)==0)
            bool=true;
        return bool;
    }
}
