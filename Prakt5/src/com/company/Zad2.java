package com.company;

public class Zad2 {
    public static boolean canMove(String figure, String pos, String cel) {
        boolean bool = false;
        //System.out.println(figure);
        switch (figure) {

            case "пешка":{
                //System.out.println('1');
                if (pos.charAt(0) == cel.charAt(0) &&
                        (pos.charAt(1) == cel.charAt(1) - 1 || (pos.charAt(1) == '2' && pos.charAt(1) == cel.charAt(1) - 2))) {
                    bool = true;
                } else {
                    bool = false;
                }
                break;
            }
            case "конь":{
                //System.out.println('2');
                if ((Math.abs(pos.charAt(0) - cel.charAt(0)) == 2 && Math.abs(pos.charAt(1) - cel.charAt(1)) == 1) ||
                        (Math.abs(pos.charAt(0) - cel.charAt(0)) == 1 && Math.abs(pos.charAt(1) - cel.charAt(1)) == 2)) {
                    bool = true;
                } else {
                    bool = false;
                }
                break;}
            case "ладья":{
                //System.out.println('3');
                if (pos.charAt(0) == cel.charAt(0) || pos.charAt(1) == cel.charAt(1)) {
                    bool = true;
                } else {
                    System.out.println(pos.charAt(1));
                    System.out.println(cel.charAt(1));
                    bool = false;
                }
                break;}
            case "слон":{
                //System.out.println('4');
                if (Math.abs(pos.charAt(0) - pos.charAt(1)) == Math.abs(cel.charAt(0) - cel.charAt(1))) {
                    bool = true;
                } else {
                    bool = false;
                }
                break;}
            case "ферзь":{
                //System.out.println('5');
                if ((pos.charAt(0) == cel.charAt(0) || pos.charAt(1) == cel.charAt(1)) ||
                        (Math.abs(pos.charAt(0) - pos.charAt(1)) == Math.abs(cel.charAt(0) - cel.charAt(1)))) {
                    bool = true;
                } else {
                    bool = false;
                }
                break;}
            case "король": {
               // System.out.println('6');
                if ((pos.charAt(0) == cel.charAt(0) && Math.abs(pos.charAt(1) - cel.charAt(1)) == 1) ||
                        (pos.charAt(1) == cel.charAt(1) && Math.abs(pos.charAt(0) - cel.charAt(0)) == 1) ||
                        (Math.abs(pos.charAt(0) - cel.charAt(0)) == 1 && Math.abs(pos.charAt(1) - cel.charAt(1)) == 1)) {
                    bool = true;
                } else {
                    bool = false;
                }
                break;
            }
        }
    return bool;
    }
}

