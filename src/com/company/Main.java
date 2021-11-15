package com.company;

import java.io.IOException;
//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String mat_v;

    public static void main(String[] args) throws IOException {
        Number rim = new Number();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String mat_v = in.nextLine();

        mat_v = rim.del_space(mat_v); // удаление пробелов из строки

        String mas3[] = rim.del_mat_zn(mat_v); // разбить строку на числа и знак дейсвия, держим в массиве.
                                                // Первый элемент это проверка: один знак или нет
        int a = 0;
        int b = 0;
        if (Integer.parseInt(mas3[0]) == 1) {
            int mas1[] = rim.arab(mas3[1], mas3[3]); // проверяем арабские числа пришили или нет.
            a = mas1[0]; // записываем в переменную первое число
            b = mas1[1]; // записываем в переменную первое число

            if (rim.in_rimskoe(mas3[1], mas3[3])) { // проверяем римские чила пришили или нет. k1 должно равно быть 2
                int mas2[] = rim.rimskoe_to_arab(mas3[1], mas3[3]);
                a = mas2[0];
                b = mas2[1];
            }

            int s = -1;
            if ((a == 0) || (b == 0)) {
                throw new IOException();
                //System.out.println("Нет цифр");
            }
            else {
                switch (mas3[2]) {
                    case "+":
                        s = a + b;
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
                if (rim.in_rimskoe(mas3[1], mas3[3])) { //Если римское вошло
                    if (s > 0) {                        // и сумма образовалась
                        System.out.println(rim.rimskoe(s)); // переводим в римские цифры
                    } else {
                        System.out.println("У римлян нет отрицательных числел");
                        throw new IOException();
                    }
                } else {
                    System.out.println(s); //если арабские пришли, то выводим арабскими
                }
            }
        } else {
            try {
                throw new Exception("Если нет знаков математических действий");
            } catch (Exception e) {
                System.out.println("Математическое выражение некоректное");
            }
        }
        in.close();

    }


}