package Lr1;

import java.util.Scanner;

public class Job9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number1 = in.nextInt();
        int number2 = number1 - 1;
        int number3 = number1 + 1;
        int number4 = number1 + number2 + number3;
        number4 = number4*number4;
        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2);
        System.out.println("Третье число: " + number3);
        System.out.println("Четвёртое число: " + number4);
        in.close();

    }
}