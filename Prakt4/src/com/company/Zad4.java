package com.company;

public class Zad4 {
    public static String overTime(double start, double end, double stavka, double cof)
    {
        double norm = 0;
        double over = 0;
        int ostart = 9;
        int oend = 17;
        if (start < ostart && end < ostart) //если работа шла в сверхурочное время до начала рабочего дня
        {
            over = end - start;
        }
        else if (start < ostart && end >= ostart && end <= oend) // если работа началась до начала рабочего дня и кончилась до конца рабочего дня
        {
            over = ostart - start;
            norm = end - ostart;
        }
        else if (start < ostart && end > oend) // если работа началась до раб дня и кончилась после
        {
            over = ostart - start + end - oend;
            norm = ostart + oend;
        }
        else if (start >= ostart && start <= oend && end >= ostart && end <= oend)// если начало и конец во время раб дня
        {
            norm = end - start;
        }
        else if (start >= ostart && start <= oend && end > oend)// если начало во время раб дня а конец после
        {
            norm = oend - start;
            over = end - oend;
        }
        else
        {
            over = end - start; // работа после рабочего дня
        }

        return "$" + String.format("%.2f", norm*stavka + over*stavka*cof); // строка с форматированием чтобы два знака после запятой
    }

}
