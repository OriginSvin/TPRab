package com.company.thread;

public class Cube extends Thread{
    public void printRes(int n)
    {
        System.out.println("Третий поток:\t" + Integer.toString(((int)Math.pow(n, 3))));
    }
}
