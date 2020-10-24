package com.company;

public class Zad3 {

    public static boolean checkPerfect(int a)
    {
        boolean bool = false;
        int sum = 1;
        int n = 0;
        n = (int)Math.ceil(Math.sqrt(a));
        for (int i = 2; i < n; i++)
        {
            if (a % i == 0)
            {
                n = a / i;
                sum += i;
                sum += n;

                if (sum > a)
                {
                    bool = false;
                }
            }
        }

        if (sum != a)
        {
            bool = false;
        }
        else
        {
            bool = true;
        }
        return bool;
    }
}
