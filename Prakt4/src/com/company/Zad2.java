package com.company;

public class Zad2 {

    public static String split(String str)
    {
        String str1 = "";
        int colvo = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i); //берем символ из строки
            str1 += ch;

            if (ch == '(') // считаем количество открытых скобок
            {
                colvo++;
            }
            else// считаем количество закрытых скобок
            {
                colvo--;
            }

            if (colvo == 0) // если скобки закрыты то ставим пробел
            {
                str1 += ' ';
            }
        }
        return str1;
    }
}
