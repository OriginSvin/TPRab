package com.company;

public class Zad9 {
    public static int sumOfCubes (int b, int[] mas)
    {
        int c=0;
        for (int i=0;i<b;i++)
        {
            c=c+mas[i]*mas[i]*mas[i];
        }
        return c;
    }
}
