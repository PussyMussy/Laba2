package Lr2;


import java.util.Scanner;

public class job4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number < 11 & number > 4)
        {
            System.out.println("Число удовлетворяет условию (оно входит в диапазон от 5 до 10 включительно)");
        }
        else {
            System.out.println("Число не удовлетворяет условию (оно не входит в диапазон от 5 до 10 включительно)");
        }

        scanner.close();
    }
}