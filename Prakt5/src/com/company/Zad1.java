package com.company;

public class Zad1 {
    public static String encrypt(String str)
    {
        String res = "";
        char Ch1 = str.charAt(0);
        res += (int)Ch1;
        res += " ";
        for (int i = 1; i < str.length(); i++)
        {
            char Ch2 = str.charAt(i); // так кодируется согласно заданию
            res += Ch2 - Ch1;
            res += " ";
            Ch1 = Ch2;
        }
        return res;
    }

    public static String decrypt(String str)
    {
        String res = "";
        String[] code = str.split(" "); // разделяем элементы по пробелу
        int symbol = Integer.parseInt(code[0]); // перевод в число буквы
        res += (char)symbol; // запись первого кода
        for (int i = 1; i < code.length; i++) // переводим другие буквы
        {
            symbol += Integer.parseInt(code[i]); // потому что так кодируется по заданию
            //System.out.println(symbol);
            res += (char)(symbol);
        }
        return res;
    }
}
