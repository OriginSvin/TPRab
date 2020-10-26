package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad5 {
    public static String getHashTags(String str)
    {
        String[] words = str.split(" |\\W "); //любой символ, кроме буквенного, цифрового или знака подчёркивания
        ArrayList<String> res = new ArrayList<>(3); // создаем лист для 3 слов
        res.add("");
        res.add("");
        res.add("");
        for (String word : words)
        {
            if (!res.contains(word)) // если слова нет и оно длинне всех то в первое записываем а другие смещаем, при это 3 слово уходит
            {
                if (word.length() > res.get(2).length())
                {
                    if (word.length() > res.get(1).length())
                    {
                        if (word.length() > res.get(0).length())
                        {
                            res.set(2, res.get(1));
                            res.set(1, res.get(0));
                            res.set(0, word);
                        }
                        else
                        {
                            res.set(2, res.get(1)); // если больше второго
                            res.set(1, word);
                        }
                    }
                    else
                    {
                        res.set(2, word);// если больше третьего
                    }
                }
            }
        }
        String result = "";
        Iterator<String> it = res.iterator(); // итератор переборщик
        while (it.hasNext())
        {
            String val = it.next();
            if (!val.equals("")) // добавляем хэш теги и меняем регистр
            {
                result += "#"+val.toLowerCase()+" ";
            }
        }
        return result;
    }
}
