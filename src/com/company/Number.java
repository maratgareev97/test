package com.company;

import java.util.Arrays;

public class Number {
    public static String rimskoe(int x) {
        String s1 = "";
        String s2 = "";
        String s = "";
        int ed;
        int des;
        if (x==100){
            return s="C";
        }
        ed = x % 10;
        des = x / 10;
        s = Integer.toString(des) + " " + Integer.toString(ed);
        switch (ed) {
            case 1:
                s1 = "I";
                break;
            case 2:
                s1 = "II";
                break;
            case 3:
                s1 = "III";
                break;
            case 4:
                s1 = "IV";
                break;
            case 5:
                s1 = "V";
                break;
            case 6:
                s1 = "VI";
                break;
            case 7:
                s1 = "VII";
                break;
            case 8:
                s1 = "VIII";
                break;
            case 9:
                s1 = "IX";
                break;
            case 10:
                s1 = "X";
                break;
            case 0:
                s1 = "";
                break;
        }
        switch (des) {
            case 1:
                s2 = "X";
                break;
            case 2:
                s2 = "XX";
                break;
            case 3:
                s2 = "XXX";
                break;
            case 4:
                s2 = "XL";
                break;
            case 5:
                s2 = "L";
                break;
            case 6:
                s2 = "LX";
                break;
            case 7:
                s2 = "LXX";
                break;
            case 8:
                s2 = "LXXX";
                break;
            case 9:
                s2 = "XC";
                break;
            case 0:
                s2 = "";
                break;
        }
        s = s2 + s1;
        return s;  //возвращаем посчитанное значение
    }
    public static String del_space(String s){
        // -----------------------------------Удаление пробелов---------------------------------------------
        StringBuilder mat_v1 = new StringBuilder(s);
        int i = 0;
        while (i < mat_v1.length() - 1) {
            i++;
            if (mat_v1.charAt(i) == ' ') {
                mat_v1.delete(i, i + 1);
                i = 0;
            }
        }
        return mat_v1.toString();
        //------------------------------------------------------------------------------------------
    }

    public static String count_mat(String mat_v){
        return "0";
    }
}