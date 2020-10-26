package com.company;

public class Zad5 {
    public static String BMI(String str1, String str2)
    {
        double h , w;
        h = 0;
        w = 0;
        String str="";
        String str3="";
        boolean bool = true;
        int c=0;
        String[] ss = str1.split(" "); // разделяем элементы по пробелу
        String[] ss2 = str2.split(" ");
        if (ss[1].equals("pounds"))
        {
            w=Double.parseDouble(ss[0])*0.45359237;
        }
        else
        {
            w=Double.parseDouble(ss[0]);
        }
        if (ss2[1].equals("inches"))
        {
            h=Double.parseDouble(ss2[0])*0.0254;
        }
        else
        {
            h=Double.parseDouble(ss2[0]);
        }
        double val = w / (h*h);
        String res = String.format("%.1f", val);
        if (val < 18.5)
        {
            res += " Underweight";
        }
        else if (val >= 18.5 && val < 25)
        {
            res += " Normal weight";
        }
        else
        {
            res += " Overweight";
        }

        return res;

    }
}
