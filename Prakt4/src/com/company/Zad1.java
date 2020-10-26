package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad1 {
    public static String essay(int k, ArrayList<String> strarray)
    {
        String str = "";
        int a = k;
        Iterator<String> iter = strarray.iterator(); // iterator это перечисление

        String str1 = iter.next(); // берем первое слово
        str += str1 + " "; //добавляем в результат слово и пробел
        a -= str1.length(); // уменьшаем место в первой строке
        while (iter.hasNext()) // идем до конца массива слов
        {
            str1 = iter.next(); // берем слово из массива слов
            if (a < str1.length()) // если не помещается то переходим на следующую строку
            {
                str += '\n';
                a = k;
            }
            str += str1 + " ";
            a -= str1.length();
        }

        return str;
    }
}
