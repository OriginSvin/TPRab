package com.company;

public class Zad4 {
    public static boolean profitableGamble (double prob, double prize, double pay)
    {
        boolean t = false;
        if ((prob*prize)>pay)
            t = true;
        return t;
    }
}
