package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nom;
        String str = "Введите номер задачи";
        System.out.println(str);
        nom = in.nextInt();
        switch (nom) {

            case 1: {
                str = "Введите строку и количество символов для задачи 1";
                System.out.println(str);

                str = in.next();
                int a = in.nextInt();
                str = Zad1.repeat(str, a);
                System.out.println(str);
                break;
            }
            case 2: {
                str = "Введите количество чисел в массиве для задачи 2";
                System.out.println(str);
                int a = in.nextInt();
                str = "Введите массив для задачи 2";
                System.out.println(str);
                int[] mas = new int[a];
                for (int i = 0; i < a; i++) {
                    mas[i] = in.nextInt();
                }
                a = Zad2.differenceMaxMin(mas);
                System.out.println(a);
                break;
            }
            case 3: {
                str = "Введите количество чисел в массиве для задачи 3";
                System.out.println(str);
                int a = in.nextInt();
                str = "Введите массив для задачи 3";
                System.out.println(str);
                int[] masiv = new int[a];
                for (int i = 0; i < a; i++) {
                    masiv[i] = in.nextInt();
                }
                boolean bool = false;
                bool = Zad3.isAvgWhole(masiv);
                System.out.println(bool);
                break;
            }
            case 4: {
                str = "Введите количество чисел в массиве для задачи 4";
                System.out.println(str);
                int a = in.nextInt();
                str = "Введите массив для задачи 4";
                System.out.println(str);
                int[] m4 = new int[a];
                for (int i = 0; i < a; i++) {
                    m4[i] = in.nextInt();
                }
                Zad4.cumulativeSum(m4);
                for (int i = 0; i < a; i++) {
                    System.out.println(m4[i]);
                }
                break;
            }
            case 5: {
                str = "Введите число для задачи 5";
                System.out.println(str);
                String str1 = in.nextLine();
                int a = Zad5.getDecimalPlaces(str1);
                System.out.println(a);
                break;
            }
            case 6: {
                System.out.println("Введите число для задачи 6");
                int n = in.nextInt();
                System.out.println(Zad6.fibonacci(n));
                break;
            }
            case 7: {
                System.out.println("Введите почтовый индекс для задачи 7:");
                str = in.next();
                System.out.println(Zad7.isValid(str));
                break;
            }
            case 8: {
                System.out.println("Введите два слова для задачи 8:");
                String str1 = in.next();
                String str2 = in.next();
                System.out.println(Zad8.isStrangePair(str1, str2));
                break;
            }
            case 9: {
                System.out.println("Введите слово и префикс/суффикс:");
                String word = in.next();
                str = in.next();
                if (str.charAt(0) == '-')
                {
                    System.out.println(Zad9.isSuffix(word, str));
                }
                else
                {
                    System.out.println(Zad9.isPrefix(word, str));
                }
                break;
            }
            case 10:
            {
                System.out.println("Введите номер шага для задачи 10:");
                int n = in.nextInt();
                System.out.println(Zad10.boxSeq(n));
                break;
            }
        }
    }
}
