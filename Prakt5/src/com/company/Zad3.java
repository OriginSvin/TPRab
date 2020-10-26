package com.company;

public class Zad3 {
    public static boolean canComplete(String str1, String str2)
    {
        int j = 0;
        for (int i = 0; i < str2.length(); i++)
        {
            if (j >= str1.length()) // если раньше конца второго слова встретились все буквы в нужном порядке
            {
                return true;
            }

            char ch = str2.charAt(i);
            if (ch == str1.charAt(j)) //проверяем встречаются ли буквы из первого слова во втором с нужным порядком
            {
                j++;
            }
        }
        if (j == str1.length()) // если встретились все буквы
        {
            return true;
        }
        else
        {
            return false; // если не встретили все буквы в нужном порядке
        }
    }
}
