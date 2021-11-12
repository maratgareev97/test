package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Number rim = new Number();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String mat_v = in.nextLine();

        mat_v=rim.del_space(mat_v);

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

        //String mas1 = rim.count_mat(mat_v);

        //System.out.println(mas1+"count"+mas1);

        int a = 0;
        int b = 0;
        if (i == 1) {
            //System.out.println(Arrays.toString(mas));
            //System.out.println(i + " i");
            //-----------проверка на арабское число-----------------------
            int k = 0;
            String[] nabob1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            for (i = 0; i < 10; i++) {
                //System.out.println(nabob1[i] + " f " + mas[0]);
                if (mas[0].equals(nabob1[i])) {
                    k++;
                }
                if (mas[2].equals(nabob1[i])) {
                    k++;
                }
                if (k == 2) {
                    a = Integer.parseInt(mas[0]);
                    b = Integer.parseInt(mas[2]);
                }
            }
            //----------------------------------------------------------------------
            int k1 = 0;
            //-----------------проверка на рисмкое---------------------------
            String[] nabob2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            for (i = 0; i < 10; i++) {
                //System.out.println(nabob1[i] + " f " + mas[0]);
                if (mas[0].equals(nabob2[i])) {
                    k1++;
                }
                if (mas[2].equals(nabob2[i])) {
                    k1++;
                }
            }
            if (k1 == 2) {
                switch (mas[0]) {
                    case "I":
                        mas[0] = "1";
                        break;
                    case "II":
                        mas[0] = "2";
                        break;
                    case "III":
                        mas[0] = "3";
                        break;
                    case "IV":
                        mas[0] = "4";
                        break;
                    case "V":
                        mas[0] = "5";
                        break;
                    case "VI":
                        mas[0] = "6";
                        break;
                    case "VII":
                        mas[0] = "7";
                        break;
                    case "VIII":
                        mas[0] = "8";
                        break;
                    case "IX":
                        mas[0] = "9";
                        break;
                    case "X":
                        mas[0] = "10";
                        break;
                }
                switch (mas[2]) {
                    case "I":
                        mas[2] = "1";
                        break;
                    case "II":
                        mas[2] = "2";
                        break;
                    case "III":
                        mas[2] = "3";
                        break;
                    case "IV":
                        mas[2] = "4";
                        break;
                    case "V":
                        mas[2] = "5";
                        break;
                    case "VI":
                        mas[2] = "6";
                        break;
                    case "VII":
                        mas[2] = "7";
                        break;
                    case "VIII":
                        mas[2] = "8";
                        break;
                    case "IX":
                        mas[2] = "9";
                        break;
                    case "X":
                        mas[2] = "10";
                        break;
                }
                a = Integer.parseInt(mas[0]);
                b = Integer.parseInt(mas[2]);
                //System.out.println(mas[0] + "," + mas[2]);
            }
            //-----------------------------------------------------------------------

            int s = -1;
            if ((a == 0) || (b == 0)) {
                throw new IOException();
                //System.out.println("Нет цифр");
            } else {
                switch (mas[1]) {
                    case "+":
                        s = a + b;
                        //System.out.println(a + "," + b + "," + s + ",");
                        break;
                    case "-":
                        s = a - b;
                        break;
                    case "*":
                        s = a * b;
                        break;
                    case "/":
                        s = a / b;
                        break;
                }
                if (k1 == 2) {
                    if (s > 0) {
                        System.out.println(rim.rimskoe(s));
                    }
                    else {
                        System.out.println("У римлян нет отрицательных числел");
                        throw new IOException();
                    }
                } else {
                    System.out.println(s);
                }
            }
        }
        else {
            try {
                throw new Exception("Если нет знаков математических действий");
            } catch (Exception e) {
                System.out.println("Математическое выражение некоректное");
            }
        }
        in.close();

    }


}