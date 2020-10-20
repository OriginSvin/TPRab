package com.company;

public class Zad2 {

    public static int differenceMaxMin (int[] mas)
    {
        int raz,min,max;
        raz = 0;
        min = mas[0];
        max = mas[0];
        raz = mas.length;
        for (int i=1;i<raz;i++)
        {
            if (mas[i]>max)
                max=mas[i];
            else if(mas[i]<min)
                min=mas[i];
        }
        raz = Math.abs(max-min);
        return raz;
    }
}
