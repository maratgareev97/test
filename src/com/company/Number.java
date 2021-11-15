package com.company;

import java.util.Arrays;

public class Number {
    public static String rimskoe(int x) {
        String s1 = "";
        String s2 = "";
        String s = "";
        int ed;
        int des;
        if (x == 100) {
            return s = "C";
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

    public static String del_space(String s) {
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

    public static boolean arab(String first_num, String second_mun) {
        int a = 0;
        int b = 0;
        //System.out.println(Arrays.toString(mas));
        //System.out.println(i + " i");
        //-----------проверка на арабское число-----------------------
        int k = 0;
        String[] nabob1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < 10; i++) {
            //System.out.println(nabob1[i] + " f " + mas[0]);
            if (first_num.equals(nabob1[i])) {
                k++;
            }
            if (second_mun.equals(nabob1[i])) {
                k++;
            }
            if (k == 2) {
                a = Integer.parseInt(first_num);
                b = Integer.parseInt(second_mun);
                return true;
            }
        }
        return false;
        //return new int[]{a, b};
    }

    public static boolean in_rimskoe(String first_num, String second_mun) {
        int k1 = 0;
        int a = 0;
        int b = 0;
        //-----------------проверка на рисмкое---------------------------
        String[] nabob2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < 10; i++) {
            //System.out.println(nabob1[i] + " f " + mas[0]);
            if (first_num.equals(nabob2[i])) {
                k1++;
            }
            if (second_mun.equals(nabob2[i])) {
                k1++;
            }
        }
        if (k1==2){
            return true;
        }
    return false;
    }

    public static int[] rimskoe_to_arab(String first_num, String second_mun) {
        int a=0;
        int b=0;
        switch (first_num) {
            case "I":
                first_num = "1";
                break;
            case "II":
                first_num = "2";
                break;
            case "III":
                first_num = "3";
                break;
            case "IV":
                first_num = "4";
                break;
            case "V":
                first_num = "5";
                break;
            case "VI":
                first_num = "6";
                break;
            case "VII":
                first_num = "7";
                break;
            case "VIII":
                first_num = "8";
                break;
            case "IX":
                first_num = "9";
                break;
            case "X":
                first_num = "10";
                break;
        }
        switch (second_mun) {
            case "I":
                second_mun = "1";
                break;
            case "II":
                second_mun = "2";
                break;
            case "III":
                second_mun = "3";
                break;
            case "IV":
                second_mun = "4";
                break;
            case "V":
                second_mun = "5";
                break;
            case "VI":
                second_mun = "6";
                break;
            case "VII":
                second_mun = "7";
                break;
            case "VIII":
                second_mun = "8";
                break;
            case "IX":
                second_mun = "9";
                break;
            case "X":
                second_mun = "10";
                break;
        }
        a=Integer.parseInt(first_num);
        b=Integer.parseInt(second_mun);
    return new int[]{a, b};
    }

    public static String[] del_mat_zn(String mat_v) {
        int i = 0;

        int plus1 = mat_v.indexOf("+");
        int plus2 = mat_v.lastIndexOf("+");
        int minus1 = mat_v.indexOf("-");
        int minus2 = mat_v.lastIndexOf("-");
        int umn1 = mat_v.indexOf("*");
        int umn2 = mat_v.lastIndexOf("*");
        int del1 = mat_v.indexOf("/");
        int del2 = mat_v.lastIndexOf("/");

        String[] mas = new String[3];
        if ((plus1 != -1) && (plus2 == plus1)) {
            //String[]
            mas[0] = mat_v.substring(0, plus1);
            mas[1] = mat_v.substring(plus1, plus1 + 1);
            mas[2] = mat_v.substring(plus1 + 1);
            i++;
        }
        ;
        if ((minus1 != -1) && (minus1 == minus2)) {
            mas[0] = mat_v.substring(0, minus1);
            mas[1] = mat_v.substring(minus1, minus1 + 1);
            mas[2] = mat_v.substring(minus1 + 1);
            i++;
        }
        ;
        if ((umn1 != -1) && (umn1 == umn2)) {
            mas[0] = mat_v.substring(0, umn1);
            mas[1] = mat_v.substring(umn1, umn1 + 1);
            mas[2] = mat_v.substring(umn1 + 1);
            i++;
        }
        if ((del1 != -1) && (del1 == del2)) {
            mas[0] = mat_v.substring(0, del1);
            mas[1] = mat_v.substring(del1, del1 + 1);
            mas[2] = mat_v.substring(del1 + 1);
            i++;
        }

    return new String[]{String.valueOf(i),mas[0], mas[1],mas[2]};
    }
}