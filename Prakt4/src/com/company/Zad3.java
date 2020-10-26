package com.company;

public class Zad3 {
    public static String toCamelCase(String str)
    {
        String str1 = "";
        boolean bool = false;
        for (int i = 0; i < str.length(); i++) //перебераем символы строки
        {
            char c = str.charAt(i); // берем символ из строки
            if (c == '_') // если _ то ставим маркер и пропускаем символ
            {
                bool = true;
            }
            else if (bool) // при активном маркере переводим в заглавные
            {
                bool = false;
                str1 += (char)(c-32); // перевод строчной в заглавную
            }
            else
            {
                str1 += c;
            }
        }

        return str1;
    }

    public static String toSnakeCase(String str)
    {
        String str1 = "";

        for (int i = 0; i < str.length(); i++) //перебераем символы строки
        {
            char c = str.charAt(i);// берем символ из строки
            if (c >= 'A' && c <= 'Z') // есил заглавная буква то ставим пробел
            {
                str1 += '_';
                str1 += (char)(c+32); // перевод заглавной в строчную
            }
            else
            {
                str1 += c;
            }
        }

        return str1;
    }
}
