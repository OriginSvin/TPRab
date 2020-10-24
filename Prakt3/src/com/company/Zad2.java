package com.company;

public class Zad2 {
    public static int findZip(String str)
    {
        int con = 0;
        con = str.indexOf("zip",str.indexOf("zip")+3);
        return  con;
    }
}
