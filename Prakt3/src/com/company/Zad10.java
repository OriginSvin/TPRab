package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Zad10 {
    public static boolean rightTriangle(int a, int b, int c)
    {
        boolean bool = false;
        int d=0;
        if(a>c) {
            d = c;
            c = a;
            a = d;
        }
        if(b>c) {
            d = c;
            c = b;
            b = c;
        }


        if (a*a + b*b == c*c)
        {
            bool = true;
        }
        else
        {
            bool = false;
        }
        return bool;
    }
}
