package com.company;

public class Zad2 {
    public static String translateSentence(String str)
    {
        String[] s = str.split(" "); // разбивает строку по словам
        String res = "";
        for (String word : s) // переводит слова из строки или слово если оно одно
        {
            res += translateWord(word) + " ";
        }

        return res;
    }

    public static String translateWord(String word) // тут переводится слово
    {
        boolean bool;
        char ch = word.charAt(0); // берем первую букву
        if (ch >= 'A' && ch <= 'Z') // проверяем на то является ли оно заглавной буквой
        {
            bool = true;
        }
        else
        {
            bool = false;
        }
        word = word.toLowerCase(); // изменяем регист
        String buff = "";
        String res = "";
        int index = word.length(); // длинна слова
        for (int i = 0; i < index; i++)
        {
            ch = word.charAt(i); // берем символ
            if (ch < 'a' || ch > 'z') // если не буква
            {
                index = i;
            }
        }
        if (index != word.length())
        {
            buff = word.substring(index); // запоминаем знак препинания
        }

        ch = word.charAt(0);
        if (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a') // если начало гласная
        {
            if (bool)// если регистр маленький и должен быть заглавным то меняем
            {
                res += (char)(word.charAt(0)-32);
            }
            else
            {
                res += word.charAt(0);
            }

            if (index != 1)
            {
                res += word.substring(1, index);
            }
            res += "yay" + buff;
        }
        else
        {
            String clearWord = word.substring(0, index); // если начло соглсная
            String str = Character.toString(clearWord.charAt(0));
            for (int i = 1; i < clearWord.length(); i++)
            {
                ch = clearWord.charAt(i);
                if (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a')
                {
                    index = i; // ищем гласную
                    break;
                }
                else
                {
                    str += ch;
                }
            }
            if (bool) // если должна быть заглавная
            {
                res += (char)(clearWord.charAt(index)-32);
            }
            else
            {
                res += clearWord.charAt(index);
            }

            if (index != clearWord.length()-1) // если гласная не последняя
            {
                res += clearWord.substring(index+1);
            }
            res += str + "ay" + buff;
        }
        return res;
    }
}
