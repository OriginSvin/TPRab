package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad3 {
    public static boolean validColor(String str)
    {
        String pattern = "rgb\\(\\d+,\\d+,\\d+\\)"; // строка шаблон rgb скобка число число число скобка
        Pattern pat = Pattern.compile(pattern); // Pattern это регулярное выражение, в него закладывается шаблон
        Matcher mat = pat.matcher(str); //  Matcher ищет совпадение по шаблону
        if (!mat.find()) // если первый шаблон не прошел то проверяем второй
        {
            pattern = "rgba\\(\\d+,\\d+,\\d+,(1|(0(\\.\\d+)?))\\)";//  4 символ от 0 до 1 это прозрачность
            pat = Pattern.compile(pattern);
            mat = pat.matcher(str);
            if (!mat.find())
            {
                return false; // если по шаблонам не прошло то сразу лож
            }
        }

        pattern = "\\d+";
        pat = Pattern.compile(pattern);
        mat = pat.matcher(str);
        for (int i = 0; i < 3; i++)
        {
            mat.find(); // он как бы захватывает совпадение, а потом берет другю часть с совпадением
            int val = Integer.parseInt(mat.group(0));
            if (val < 0 || val > 255)
            {
                return false; // если не код то лож
            }
        }

        return true;
    }
}
