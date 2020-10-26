package com.company;

public class Zad6 {
    public static boolean validateCard(String str)
    {
        if (str.length() < 14 || str.length() > 19) // проверяем длинну символьную, если не подходит сразу false
        {
            return false;
        }
        char check = str.charAt(str.length()-1); // сохраняем последнюю цифру
        str = str.substring(0, str.length()-1); // строка равна строке без последнего символа
        str = new StringBuilder(str).reverse().toString(); // StringBuilder нужен чтобы развернуть строку
        String strx2 = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (i % 2 == 0) // проверка на нечетность символа, да четная позиция в строке нечетное число, ибо с 0 нумерация, а не с 1
            {
                int a = Integer.parseInt(String.valueOf(str.charAt(i)))*2; // удваиваем значение строки
                if (a > 9) // если число двоичное
                {
                    a = a/10 + a%10;
                }
                strx2 += Integer.toString(a);
            }
            else
            {
                strx2 += str.charAt(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < strx2.length(); i++)  // складываем полученые цифры
        {
            sum += Integer.parseInt(String.valueOf(strx2.charAt(i)));
        }
        sum = 10 - sum % 10; // вычитаем последнюю цифру суммы
        if (check == Integer.toString(sum).charAt(0)) //сравниваем с последний числов первой последовательности
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
