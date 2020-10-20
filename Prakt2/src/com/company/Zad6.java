package com.company;

public class Zad6 {

    public static int fibonacci (int n)
    {
        switch (n)
        {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                int a = 1;
                int b = 2;
                int res;
                for (int i = 3; i < n; i++)
                {
                    res = a + b;
                    a = b;
                    b = res;
                }
                return a + b;
        }
    }
}
