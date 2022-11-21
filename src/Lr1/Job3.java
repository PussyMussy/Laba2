package Lr1;

import java.util.Scanner;

public class Job3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = in.nextLine();

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите дату (номер дня в месяце): ");
        int number = in.nextInt();

        System.out.println("День недели: " + day);
        System.out.println("Месяц: " + month);
        System.out.println("Дата (номер дня в месяце): " + number);
        in.close();

    }
}