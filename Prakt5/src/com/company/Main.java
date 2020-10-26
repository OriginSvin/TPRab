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
                System.out.println("Введите сообщение для задачи 1:");
                in.nextLine();
                str = in.nextLine();
                if (str.charAt(0) >= '0' && str.charAt(0) <= '9') // выбор надо кодировать или декодировать
                {
                    System.out.println(Zad1.decrypt(str));
                }
                else
                {
                    System.out.println(Zad1.encrypt(str));
                }
                break;
            }
            case 2:
            {
                System.out.println("Введите фигуру (пешка, конь, ладья, слон, ферзь, король), ее положение и целевую позицию. (Вы играете за белых)");

                String figure = in.next(); // ввод русский, так как так в задании
                String pos = in.next();
                String cel = in.next();
                System.out.println(Zad2.canMove(figure, pos, cel));
                break;
            }
            case 3:
            {
                System.out.println("Введите входную строку и ее итоговую версию для задачи 3:");
                in.nextLine();
                str = in.nextLine();
                String str2 = in.nextLine();
                System.out.println(Zad3.canComplete(str, str2));
                break;
            }
            case 4:
            {
                System.out.println("Введите последовательность чисел для задачи 4:");
                in.nextLine();
                String[] strArr = in.nextLine().split(" "); // ввод чисел через пробел разбивается сплитом
                ArrayList<Integer> mas = new ArrayList<>(strArr.length); // создается arraylist нужной длинны для хранения чисел
                for (int i = 0; i < strArr.length; i++)
                {
                    mas.add(Integer.parseInt(strArr[i])); // заносим числа в лист преобразовывая строковый тип
                }
                System.out.println(Zad4.sumDigProd(mas));

                break;
            }
            case 5:
            {
                System.out.println("Введите последовательность слов для задачи 5:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad5.sameVowelGroup(str));
                break;
            }
            case 6:
            {
                System.out.println("Введите номер карты для задачи 6:"); // ставлю не число, т к может в инт не влезть
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad6.validateCard(str));
                break;
            }
            case 7:
            {
                System.out.println("Введите число для задачи 7:");
                int a = in.nextInt();
                System.out.println(Zad7.numToEng(a));
                break;
            }
            case 8:
            {
                System.out.println("Введите строку для задачи 8:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad8.getSha256Hash(str));
                break;
            }
            case 9:
            {
                System.out.println("Введите строку для задачи 9:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad9.correctTitle(str));
                break;
            }
            case 10:
            {
                System.out.println("Введите число для задачи 10:");
                int n = in.nextInt();
                System.out.println(Zad10.hexLattice(n));
                break;
            }

        }
    }
}
