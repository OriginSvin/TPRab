package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Zad6 {
    public static int ulam(int a)
    {
        ArrayList<Integer> mas = new ArrayList<>(a); // создаем лист для последовательности
        PriorityQueue<Integer> suma = new PriorityQueue<>();
        HashSet<Integer> nepovtor = new HashSet<>();
        mas.add(1); // 1 и 2 сразув начало
        mas.add(2);
        suma.add(mas.get(0) + mas.get(1)); // добавляем 3 это первая сумма
        while (mas.size() < a) // пока есть место в листе (да лист можно увеличить, это текущее)
        {
            int sum = suma.poll(); // первый элемент очереди (наименьшая сумма)
            for (int val : mas)
            {
                val += sum;
                if (!nepovtor.contains(val))
                {
                    if (!suma.contains(val))
                    {
                        suma.add(val); // если нету в очереди то добавим
                    }
                    else
                    {
                        suma.remove(val); // если есть то убираем и добавляем в неповтор
                        nepovtor.add(val);
                    }
                }
            }
            mas.add(sum);
        }
        return mas.get(a-1);
    }
}
