package com.company;

public class Zad4 {

    public static void cumulativeSum (int [] mas)
    {
        int a = mas.length;
        int b = 0;
        int sum=mas[0];
        for (int i=1;i<a;i++)
        {
            b=mas[i];
            mas[i]=mas[i]+sum;
            sum=sum+b;

        }
    }
}
