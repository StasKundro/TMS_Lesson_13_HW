package com.tms.thirdTask;

import java.util.Scanner;

/**
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом (подумать и аргмументировать решение о том будет ли это статический методо или нет).
 * В этом методе реализуйте логику:
 * - если в консоль введена цифра 1, то:
 * использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 * - если в консоль введена цифра 2, то:
 * использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.
 */

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 или 2 ");
        Integer num1 = in.nextInt();
        if (num1 == 1) {
            Work<String> work1 = (str) -> {
                return new StringBuilder(str).reverse().toString();
            };

            System.out.println(work1.func("HELLO"));
        } else if (num1 == 2) {
            System.out.println("Введите число ");
            Integer num2 = in.nextInt();
            Work<Integer> work2 = (n) -> {
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result = result * i;
                }
                return result;
            };

            System.out.println(num2 + "! = " + work2.func(num2));
        } else {
            System.out.println("Ошибка");
        }
    }
}
