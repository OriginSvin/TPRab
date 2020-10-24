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
                System.out.println("Введите значения a, b и c для первой задачи:");
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                System.out.println(Zad1.solutions(a, b, c));
                break;
            }
            case 2:
            {
                System.out.println("Введите строку для задачи 2:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad2.findZip(str));
                break;
            }
            case 3:
            {
                System.out.println("Введите число для задачи 3:");
                int a = in.nextInt();
                System.out.println(Zad3.checkPerfect(a));
                break;
            }
            case 4:
            {
                System.out.println("Введите строку для задачи 4:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad4.flipEndChars(str));
                break;
            }
            case 5:
            {
                System.out.println("Введите код для задачи 5:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad5.isValidHexCode(str));
                break;
            }
            case 6:
            {
                System.out.println("Введите два массива для задачи 6 через пробел:");
                in.nextLine();
                String[] strArr = in.nextLine().split(" ");

                ArrayList<Integer> mas1array = new ArrayList<>(strArr.length); //ArrayList похоже на массив, но из него можно удалять переменные, а не обнулять их. И это почти динамический массив
                for (int i = 0; i < strArr.length; i++)
                {
                    mas1array.add(Integer.parseInt(strArr[i]));
                }

                strArr = in.nextLine().split(" ");

                ArrayList<Integer> mas2array = new ArrayList<>(strArr.length);
                for (int i = 0; i < strArr.length; i++)
                {
                    mas2array.add(Integer.parseInt(strArr[i]));
                }

                System.out.println(Zad6.same(mas1array, mas2array));
                break;
            }
            case 7:
            {
                System.out.println("Введите число для задачи 7:");
                int a = in.nextInt();
                System.out.println(Zad7.isKaprekar(a));
                break;
            }
            case 8:
            {
                System.out.println("Введите число для задачи 8:");
                in.nextLine();
                str = in.nextLine();
                System.out.println(Zad8.longestZero(str));
                break;
            }
            case 9:
            {
                System.out.println("Введите число для задачи 9:");
                int a = in.nextInt();
                System.out.println(Zad9.nextPrime(a));
                break;
            }
            case 10:
            {
                System.out.println("Введите стороны треугольника для задачи 10:");
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                System.out.println(Zad10.rightTriangle(a,b,c));
                break;
            }
        }

    }
}
