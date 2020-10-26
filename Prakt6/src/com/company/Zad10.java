package com.company;

public class Zad10 {
    public static boolean palindromeDescendant(int a)
    {
        String str = Integer.toString(a);// переводим число в строку
        while (true)
        {
            if (str.length() < 2) // если число из одной цифры то оно не может быть полиномом
            {
                return false;
            }
            if (str.length() % 2 != 0) // если длинна нечетная
            {
                if (str.substring(0, str.length()/2).equals(new StringBuilder(str.substring(str.length()/2+1)).reverse().toString()))
                {

                    return true;
                }
                else
                {
                    return false;
                }
            }
            if (str.substring(0, str.length()/2).equals(new StringBuilder(str.substring(str.length()/2)).reverse().toString())) // если четное и подходит
            {

                return true;

            }
            else
            {
                String buff = "";
                for (int i = 0; i < str.length(); i += 2)
                {
                    buff += Integer.toString(Integer.parseInt(Character.toString(str.charAt(i))) +
                            Integer.parseInt(Character.toString(str.charAt(i+1))));

                }
                System.out.println(buff);
                str = buff;
            }
        }
    }
}
