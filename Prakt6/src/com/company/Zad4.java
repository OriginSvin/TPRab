package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Zad4 {
    public static String stripUrlParams(String str)
    {
        return stripUrlParams(str, new String[] {""});
    }

    public static String stripUrlParams(String str, String[] block)
    {
        HashSet<String> blockKeys = new HashSet<>(block.length); // запоминаем второй параметр или параметры если их несколько
        for (String val : block)
       {
            blockKeys.add(val);
       }
        String[] urlParts = str.split("\\?", 2); //разбиваем на две части по ?
        if (urlParts.length > 1)
        {
            String[] params = urlParts[1].split("&"); // разбиваем по &
            HashMap<String, String> map = new HashMap<>(); // hashmap хранит ключ значение
            for (String param : params)
            {
                String[] paramParts = param.split("=", 2);
                map.put(paramParts[0], paramParts[1]); // запоминаем параметры и так как hashmap только уникальный ключ то меняется только одно из значений но не добавляется новая строка
            }

            String res = urlParts[0] + "?";

            Set<String> keys = map.keySet(); // кейсет получаем значение всех ключей
            for (String key : keys)
            {
                if (!blockKeys.contains(key)) // в случае сли ключ есть во второй части запроса мы его не пишем
                {
                    res += key + "=" + map.get(key) + "&";
                }
            }

            return res.substring(0, res.length()-1);
        }
        else // если параметров нет возврашаем строку
        {
            return str;
        }
    }
}
