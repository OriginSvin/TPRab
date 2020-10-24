package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Zad6 {
    public static boolean same(ArrayList<Integer> mas1array, ArrayList<Integer> mas2array)
    {
        boolean bool = false;
        if ((new HashSet<Integer>(mas1array)).size() == (new HashSet<>(mas2array)).size())  //hashset хранит только уникальные значения
        {
            bool = true;
        }
        else
        {
           bool = false;
        }
        return bool;
    }
}
