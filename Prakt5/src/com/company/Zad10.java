package com.company;

public class Zad10 {
    public static String hexLattice(int n)
    {
        int m = 0;
        int v = 1;// колво точек
        int l = -1; //строки
        do
        {
            v += m;
            m += 6;
            l += 2;
        } while (v < n);
        if (v != n) // если нельзя
        {
            return "Invalid";
        }
        int mid = l/2 + 1; // середина
        String res = "";
        for (int i = 1; i <= l; i++)
        {
            if (i <= mid)
            {
                m = i;
            }
            else
            {
                m = l - i + 1;
            }

            int start = mid - m + 1;
            int end = l*2 - start;
            char ch = 'o';
            for (int j = 1; j < l*2; j++)
            {
                if (j >= start && j <= end)
                {
                    res += ch;
                    if (ch == ' ')
                        ch = 'o';
                    else
                        ch = ' ';
                }
                else
                {
                    res += ' ';
                }
            }
            res += '\n';
        }
        return res;
    }
}
