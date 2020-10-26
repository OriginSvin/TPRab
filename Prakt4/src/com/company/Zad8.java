package com.company;

public class Zad8 {
    public static boolean doesRhyme(String str1, String str2)
    {
        int index;
        index = str1.lastIndexOf(' '); // последняя встреча пробела в строке
        if (index == -1) // если его нет то слово одно и начало его с 0
        {
            index = 0;
        }
        String word1 = str1.substring(index+1).toUpperCase();// перевод в верхний регистр части строки

        index = str2.lastIndexOf(' '); // тоже самое для второго
        if (index == -1)
        {
            index = 0;
        }
        String word2 = str2.substring(index+1).toUpperCase();

        String s1 = "";
        for (int i = 0; i < word1.length(); i++) // берем только гласные из последнего слова в строке
        {
            char ch = word1.charAt(i);
            if (ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'A' || ch == 'I')
            {
                s1 += ch;
            }
        }
        int count = 0;
        for (int i = 0; i < word2.length(); i++)
        {
            char ch = word2.charAt(i);
            if (ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'A' || ch == 'I')
            {
                if (count >= s1.length())// если гласных больше чем в первом случае то не рифмуется
                {
                    return false;
                }
                else if (ch != s1.charAt(count)) // если позиция гласных не совпадает
                {
                    return false;
                }
                count++;
            }
        }
        return true;
    }
}
