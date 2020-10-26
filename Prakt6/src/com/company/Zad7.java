package com.company;

import java.util.ArrayList;

public class Zad7 {
    public static String longestNonrepeatSubstring(String str)
    {
        ArrayList<String> list = new ArrayList<>();
        String subStr = ""; // для части строки
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i); // берем символ
            if (!subStr.contains(Character.toString(ch))) // если в части символа нет то добавим его
            {
                subStr += ch;
            }
            else
            {
                list.add(subStr); // иначе добавим последовательность
                int index = subStr.indexOf(ch);
                if (index == subStr.length()-1) // обнуляем часть если конец последовательности
                {
                    subStr = "";
                }
                else
                {
                   subStr = subStr.substring(index+1);
                }
                subStr += ch;
            }
        }
        list.add(subStr); // последняя последовательность
        String res = "";
        for (String val : list) // выбираем самую длинную и выводим
        {
            if (val.length() > res.length())
            {
                res = val;
            }
        }
        return res;
    }
}
