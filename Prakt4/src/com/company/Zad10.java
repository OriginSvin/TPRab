package com.company;

import java.util.HashSet;

public class Zad10 {
    public static int countUniqueBooks(String str, String endChar)
    {
        int count = 0;
        boolean open = false;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (!open && ch == endChar.charAt(0))//проверка на начало
            {
                open = true;
            }
            else if (open)
            {
                if (ch != endChar.charAt(0)) // если последовательность не закончилась
                {
                    if (!set.contains(ch)) // если символ (книга) не встречалась
                    {
                        set.add(ch); // добавляем символ и добавляем уникальную книгу
                        count++;
                    }
                }
                else
                {
                    open = false;
                    set.clear();
                }
            }
        }
        return count;
    }
}
