package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nom;
        String str = "Введите номер задачи";
        System.out.println(str);
        nom = in.nextInt();
        switch (nom)
        {
            case 1:
            {
                System.out.println("Введите число для задачи 1:");
                int a = in.nextInt();
                System.out.println(Zad1.bell(a));
                break;
            }
            case 2:
            {
                System.out.println("Введите слово/строку для задачи 2:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad2.translateSentence(str)); // вызываем один метод, так как он ссылается на другой
                break;
            }
            case 3:
            {
                System.out.println("Введите строку для задачи 3:");
                str = in.next();
                System.out.println(Zad3.validColor(str));
                break;
            }
            case 4:
            {
                System.out.println("Введите url для задачи 4:");
                in.nextLine();
                str = in.nextLine();
                String[] strs = str.split(" ", 2);
                if (strs.length == 1) // на случай если есть несколько параметров, так в задании написано
                {
                    System.out.println(Zad4.stripUrlParams(str));
                }
                else
                {
                    System.out.println(Zad4.stripUrlParams(strs[0], strs[1].split(" ")));
                }
                break;
            }
            case 5:
            {
                System.out.println("Введите заголовок для задачи 5:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad5.getHashTags(str));
                break;
            }
            case 6:
            {
                System.out.println("Введите число для задачи 6:");
                int a = in.nextInt();
                System.out.println(Zad6.ulam(a));
                break;
            }
            case 7:
            {
                System.out.println("Введите строку для задачи 7:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad7.longestNonrepeatSubstring(str));
                break;
            }
            case 8:
            {
                System.out.println("Введите число для задачи 8:");
                int n = in.nextInt();
                System.out.println(Zad8.convertToRoman(n));
                break;
            }
            case 9:
            {
                System.out.println("Введите выражение:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad9.formula(str));
                break;
            }
            case 10:
            {
                System.out.println("Введите число:");
                int a = in.nextInt();
                System.out.println(Zad10.palindromeDescendant(a));
                break;
            }
        }
    }
}
