package com.company;

public class Zad6 {
    public static int bugger(int a)
    {
        int kolvo = 0;
        String str = Integer.toString(a); // перевод числа в строку
        while (str.length() > 1) // пока число имеет больше одной цифры
        {
            kolvo++;
            int b = 1;
            for (int i = 0; i < str.length(); i++)
            {
                b *= Integer.parseInt((str.substring(i, i+1))); //перевод строки в число и умножении цифр
            }
            str = Integer.toString(b); // перевод назад в строку, для того чтобы проверить сколько осталось знаков
        }
        return kolvo;
    }
}
