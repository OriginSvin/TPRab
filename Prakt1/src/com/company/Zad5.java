package com.company;

public class Zad5 {
    public static String operation(double c, double a, double b)
    {
        String str = "none";
        if ((a+b)==c)
            str="added";
        else
            if (((a-b)==c))
                str="subtracted";
            else
                if ((a*b)==c)
                    str="increase";
                else
                    if ((a/b)==c)
                        str="divide";
        return str;
    }
}
