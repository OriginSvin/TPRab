package com.company;

import java.util.HashSet;

public class Zad5 {
    public static String sameVowelGroup(String str)
    {
        String[] strmas = str.split(" "); // разбиваем строку по пробелу
        HashSet<Character> glas = new HashSet<>(); // заносим в хэш сет гласные , так как в нем они не повторяются
        for (int i = 0; i < strmas[0].length(); i++) // заносим гласные из первого слова в хэш сет
        {
            char ch = strmas[0].charAt(i);
            if (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a')
            {
                if (!glas.contains(ch))
                {
                    glas.add(ch);
                }
            }
        }
        String res = strmas[0]; // добавляем в результат первое слово
        for (int i = 1; i < strmas.length; i++) // перебераем слова
        {
            for (int j = 0; j < strmas[i].length(); j++)
            {
                char ch = strmas[i].charAt(j);
                if (!glas.contains(ch) &&
                        (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a'))
                {
                    break;
                }

                if (j == strmas[i].length()-1)
                {
                    res += ' '; // добавляем пробел в результат между словами
                    res += strmas[i];
                }
            }
        }
        return res;
    }
}
