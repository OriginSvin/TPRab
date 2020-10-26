package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "Введите переменные для задачи 1";
        System.out.println(str);
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = Zad1.remainder(a,b);
        System.out.println(c);
        str = "Введите переменные для задачи 2";
        System.out.println(str);
        a = in.nextInt();
        b = in.nextInt();
        c = Zad2.triArea(a,b);
        System.out.println(c);
        str = "Введите переменные для задачи 3";
        System.out.println(str);
        a = in.nextInt();
        b = in.nextInt();
        int f = in.nextInt();
        c = Zad3.animals(a,b,f);
        System.out.println(c);
        str = "Введите переменные для задачи 4";
        System.out.println(str);
        double p = in.nextDouble();
        double z = in.nextDouble();
        double pa = in.nextDouble();
        boolean bool= Zad4.profitableGamble(p,z,pa);
        System.out.println(bool);
        str = "Введите переменные для задачи 5";
        System.out.println(str);
        p = in.nextDouble();
        z = in.nextDouble();
        pa = in.nextDouble();
        str= Zad5.operation(p,z,pa);
        System.out.println(str);
        str = "Введите переменные для задачи 6";
        System.out.println(str);
        str=in.next();
        char ansii = str.charAt(0);
        a = Zad6.itoa(ansii);
        System.out.println(a);
        str = "Введите переменные для задачи 7";
        System.out.println(str);
        a = in.nextInt();
        b = Zad7.addUpTo(a);
        System.out.println(b);
        str = "Введите переменные для задачи 8";
        System.out.println(str);
        a = in.nextInt();
        b = in.nextInt();
        c=Zad8.nextEdge(a,b);
        System.out.println(c);

        str = "Введите переменные для задачи 9 mas";
        System.out.println(str);
        a = in.nextInt();
        str = "Введите переменные для задачи 9 znac mas";
        System.out.println(str);
        int [] mas = new int[a];
       for (int i=0; i<a;i++)
       {
           mas[i]=in.nextInt();
       }
        c=Zad9.sumOfCubes(a,mas); //Nado bez a posmotri
       System.out.println(c);
        str = "Введите переменные для задачи 10";
        System.out.println(str);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        bool=Zad10.abcmath(a,b,c);
        System.out.println(bool);

    }
}
