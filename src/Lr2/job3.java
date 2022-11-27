package Lr2;


import java.util.Scanner;

public class job3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int x;
        x = number % 4;
        if (x == 0)
        {
            System.out.println("Число удовлетворяет условию деления на 4 без остатка");
        }
        else {
            System.out.println("Число не удовлетворяет условию деления на 4 без остатка");
        }
        if (number > 10)
        {
            System.out.println("Число удовлетворяет условию (оно больше 10)");
        }
        else {
            System.out.println("Число не удовлетворяет условию (оно меньше 10)");

            scanner.close();
        }
    }
}