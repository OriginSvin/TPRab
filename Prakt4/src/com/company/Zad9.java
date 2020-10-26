package com.company;

public class Zad9 {
    public static boolean trouble(int a, int b)
    {
        String str1 = Integer.toString(a); // переводим в строку чисел
        String str2 = Integer.toString(b);
        char number = '\0';
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if (ch == number)
            {
                count++;
            }
            else
            {
                number = ch;
                count = 1;
            }
            if (count == 3)
            {
                if (str2.indexOf(String.copyValueOf(new char[] {number, number})) != -1) // если встречается последовательность необходимых чисел два раза подряд
                { //indexOf ищет последовательность, copyValueOf это берет символы и соединяет их в одну строку
                    return true;
                }
                else
                {
                    count = 1;
                }
            }
        }
        return false;
    }
}
