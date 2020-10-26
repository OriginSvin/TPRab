package com.company;

public class Zad9 {
    public static boolean formula(String str)
    {
        str = str.replaceAll(" ", ""); // если были пробелы убираем
        String[] parts = str.split("="); //разделяем по равно
        int part = getPart(parts[0]); // берем первую часть
        for (int i = 1; i < parts.length; i++)
        {
            if (getPart(parts[i]) != part) // сравнивает части между собой
            {
                return false;
            }
        }

        return true;
    }

    public static int getPart(String part)
    {
        if (part.charAt(0) == '-') // если первое число отриц то добавляем 0 спереди
        {
            part = "0" + part;
        }
        char operation = '?';
        int index = 0;
        int res = 0;
        for (int i = 0; i < part.length(); i++)
        {
            char ch = part.charAt(i);
            if (ch != '+' && ch != '-')
            {
                continue;
            }
            switch (operation)
            {
                case '+':
                    res += umdel(part.substring(index, i));
                    break;
                case '-':
                    res -= umdel(part.substring(index, i));
                    break;
                default:
                    res = umdel(part.substring(index, i));
            }
            operation = ch;
            index = i+1;
        }

        switch (operation)
        {
            case '+':
                if (index != part.length()-1)
                {
                    res += umdel(part.substring(index, part.length()));
                }
                else
                {
                    res += Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            case '-':
                if (index != part.length()-1)
                {
                    res -= umdel(part.substring(index, part.length()));
                }
                else
                {
                    res -= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            default:
                res = umdel(part.substring(index, part.length()));
        }

        return res;
    }

    public static int umdel(String part)
    {
        char operation = '?';
        int res = 1;
        int index = 0;
        for (int i = 0; i < part.length(); i++)
        {
            char ch = part.charAt(i);
            if (ch != '*' && ch != '/')
            {
                continue;
            }

            switch (operation)
            {
                case '*':
                    res *= Integer.parseInt(part.substring(index, i));
                    break;
                case '/':
                    res /= Integer.parseInt(part.substring(index, i));
                    break;
                default:
                    res = Integer.parseInt(part.substring(index, i));
            }
            operation = ch;
            index = i+1;
        }
        switch (operation)
        {
            case '*':
                if (index != part.length()-1)
                {
                    res *= Integer.parseInt(part.substring(index, part.length()));
                }
                else
                {
                    res *= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            case '/':
                if (index != part.length()-1)
                {
                    res /= Integer.parseInt(part.substring(index, part.length()));
                }
                else
                {
                    res /= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            default:
                res = Integer.parseInt(part.substring(index, part.length()));
        }
        return res;
    }
}
