package com.company;

public class Zad9 {
    public static String correctTitle(String str)
    {
        str = str.toLowerCase(); // в нижний регистр
        String[] words = str.split(" "); // разбиваем строку по пробелу
        String res = ""; //результат
        for (String word : words) //создается временная переменная word которая равняется words[i]
        {
            String[] subWords = word.split("-"); // если есть слова через дифис то разделяем их на два разных слова
            String subRes = ""; // часть результата
            for (String subWord : subWords)
            {
                if (!subWord.equals("of") && !subWord.equals("and") && !subWord.equals("the") && !subWord.equals("in"))
                {
                    subRes += (char)(subWord.charAt(0)-32); // первые символ заглавный
                    subRes += subWord.substring(1); // далее все оставшиеся
                    subRes += "-";
                }
                else
                {
                    subRes += subWord + "-";
                }
            }
            res += subRes.substring(0, subRes.length()-1);
            res += " ";
        }

        return res;
    }
}
