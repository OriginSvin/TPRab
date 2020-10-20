package com.company;

public class Zad3 {

    public static boolean isAvgWhole (int[] mas)
    {
        boolean bool = false;
        double a=0;
        int b=mas.length;
        for (int i=0;i<b;i++)
            a=a+mas[i];
        a=a/b;
        b=(int) a;
        if(a==b)
            bool=true;
        return bool;
    }
}
