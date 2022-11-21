package Lr1;

import java.util.Scanner;

public class Job5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        year = (year - 2022) * (-1);
        System.out.println("Ваш возраст: " + year);
        in.close();

    }
}
