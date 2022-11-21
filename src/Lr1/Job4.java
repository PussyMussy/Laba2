package Lr1;

import java.util.Scanner;

public class Job4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int number = in.nextInt();

        System.out.println("Месяц: " + month);
        System.out.println("Количество дней в месяце: " + number);
        in.close();

    }
}
