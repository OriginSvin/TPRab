package com.company.thread;

public class Square extends Thread{
    public void printRes(int n)
    {
        System.out.println("Второй поток:\t" + Integer.toString((int)Math.pow(n, 2)));
    }
}
