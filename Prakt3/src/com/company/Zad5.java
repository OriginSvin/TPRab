package com.company;

public class Zad5 {
    public static boolean isValidHexCode(String str)
    {
        boolean bool = false;
        int s=0;
        if (str.length() != 7 || str.charAt(0) != '#')
        {
            bool = false;
        }
        else {
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);

                if ((c < '0' || c > '9') && (c < 'A' || c > 'F') && (c < 'a' || c > 'f')) {
                    s=1;
                }
            }
            if(s == 0)
                bool = true;
            else
                bool = false;
        }
        return bool;
    }
}
