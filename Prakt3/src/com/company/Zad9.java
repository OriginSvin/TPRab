package com.company;

public class Zad9 {

    public static int nextPrime(int a)
    {
        if (a == 2) // 2 простое
        {
            return a;
        }

        if (a % 2 == 0) //проверка на четность
        {
            a++;
        }

        while (true)
        {
            int i;
            int end = (int)Math.ceil(Math.sqrt(a)); // округляем квадратный корень
            for ( i = 2; i <= end; i++)
            {
                if (a % i == 0)
                {
                    break;
                }
            }

            if (i == end+1)
            {
                break;
            }
            else
            {
                a += 2;
            }
        }

        return a;
    }
}
