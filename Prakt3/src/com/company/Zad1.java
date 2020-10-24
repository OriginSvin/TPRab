package com.company;

public class Zad1 {
    public static int solutions(int a, int b, int c) {
        int res = -1;
        if (b * b - 4 * a * c < 0) {
            res = 0;
        } else if (b * b - 4 * a * c == 0) {
            res = 1;
        } else if(b * b - 4 * a * c > 0){
            res = 2;
        }
        return res;
    }
}
