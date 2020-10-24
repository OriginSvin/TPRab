package com.company;

public class Zad7 {
    public static boolean isKaprekar(int n)
    {
        boolean bool = false;
        String nsqt = Integer.toString(n*n);
        String str = "";
        if (nsqt.length() == 1) // если число из одной цифры
        {
            str += "0";
        }
        str += nsqt;
        int end = str.length()/2;
        int n1 = Integer.parseInt(str.substring(0, end));
        int n2 = Integer.parseInt(str.substring(end, str.length()));

        if (n1 + n2 == n)
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
