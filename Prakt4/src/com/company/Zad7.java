package com.company;

public class Zad7 {

    public static String toStarShorthand(String str)
    {
        String res = "";
        int count = 1;
        char ch = '\0';

        for (int i = 0; i < str.length(); i++) // перебор символов строки
        {
            char ch1 = str.charAt(i); // символ из строки

            if (ch1 == ch) // сравнение с повторением символа
            {
                count++;
            }
            else
            {
                if (count != 1) // если встречается больше одного раза то ставим * и количество встечи
                {
                    res += '*';
                    res += Integer.toString(count); // перевод числа в строку (умножение на количество символов)
                    count = 1;
                }
                res += ch1; // добавляем символ в результат
                ch = ch1;
            }
        }
        if (count != 1) // на последнюю последовательность
        {
            res += '*';
            res += Integer.toString(count);
        }

        return res;
    }
}
