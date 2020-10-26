package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nom;
        String str = "Введите номер задачи";
        System.out.println(str);
        nom = in.nextInt();
        switch (nom) {
            case 1:
                {
                    System.out.println("Введите количество слов и размер строки для задачи 1:");
                    int n = in.nextInt();
                    int k = in.nextInt();
                    ArrayList<String> strarray = new ArrayList<>(n); //arraylist почти массив, но при этом его можно использовать как динамический
                    System.out.println("Введите текст для задачи 1:");
                    for (int i = 0; i < n; i++)
                    {
                        strarray.add(in.next()); // ввод данных в arraylist тут вводится массив слов, между которыми есть пробел
                    }
                    System.out.println(Zad1.essay(k, strarray)); //вызов класса и вывод его в консоль
                    break;
            }
            case 2:
            {
                System.out.println("Введите строку для задачи 2:");
                str = in.next();
                System.out.println(Zad2.split(str));
                break;
            }
            case 3:
            {
                System.out.println("Введите строку для задачи 3:");
                str = in.next();
                if (str.indexOf('_') != -1) // если встречается _ то вызываев функцию toCamelCase
                {
                    System.out.println(Zad3.toCamelCase(str));
                }
                else
                {
                    System.out.println(Zad3.toSnakeCase(str));
                }
                break;
            }
            case 4:
            {
                System.out.println("Введите значения для задачи 4:");
                double start = in.nextDouble();
                double end = in.nextDouble();
                double stavka = in.nextDouble();
                double cof = in.nextDouble();
                System.out.println(Zad4.overTime(start, end, stavka, cof));
                break;
            }
            case 5:
            {
                System.out.println("Введите рост и вес для задачи 5:");
                in.nextLine();
                String w = in.nextLine();
                String h = in.nextLine();
                System.out.println(Zad5.BMI(w, h));
                break;
            }
            case 6:
            {
                System.out.println("Введите число для задачи 6:");
                int n = in.nextInt();
                System.out.println(Zad6.bugger(n));
                break;
            }
            case 7:
            {
                System.out.println("Введите строку для задачи 7:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad7.toStarShorthand(str));
                break;
            }
            case 8:
            {
                System.out.println("Введите две строки для задачи 8:"); // мб подумать
                in.nextLine();
                String str1 = in.nextLine();
                String str2 = in.nextLine();
                System.out.println(Zad8.doesRhyme(str1, str2));
                break;
            }
            case 9:
            {
                System.out.println("Введите два числа для задачи 9:"); //  в примере инт не влазит, хотя просят целое число по этому инт
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(Zad9.trouble(a, b));
                break;
            }
            case 10:
            {
                System.out.println("Введите последовательность символов и символ, обозначающий начало/конец книги для задачи 10:");
                str = in.next();
                String endChar = in.next();
                System.out.println(Zad10.countUniqueBooks(str, endChar));
                break;
            }
        }
        }
    }

