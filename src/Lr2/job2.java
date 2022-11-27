package Lr2;


import java.util.Scanner;

public class job2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int x;
        int y;
        x = number % 5;
        y = number % 7;
        if (x == 2)
        {
            System.out.println("Число удовлетворяет условию деления на 5 (в остатке 2)");
        }
        else {
            System.out.println("Число не удовлетворяет условиям деления на 5 (в остатке 2)");
        }
        if (y == 1)
        {
            System.out.println("Число удовлетворяет условию деления на 7 (в остатке 1)");
        }
        else {
            System.out.println("Число не удовлетворяет условиям деления на 7 (в остатке 1)");

            scanner.close();
        }
    }
}