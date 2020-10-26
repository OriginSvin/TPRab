package com.company;

import java.util.ArrayList;

public class Zad4 {
    public static int sumDigProd(ArrayList<Integer> mas)
    {
        int sum = 0;
        for (int a : mas) // складываем элементы листа
        {
            sum += a;
        }
        while (sum > 9) // пока сумма больше одной цифры
        {
            String sumStr = Integer.toString(sum);
            sum = 1;

            for (int i = 0; i < sumStr.length(); i++) // сумма переведенная в строку перемножается посимвольно
            {
                sum *= Integer.parseInt(String.valueOf(sumStr.charAt(i)));
            }
        }
        return sum;
    }
}
