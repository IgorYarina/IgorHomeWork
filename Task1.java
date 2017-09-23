package home.work.week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter a number from 0 to 24");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 9 && a < 18) {
            System.out.println("Im on work");

        } else {
            System.out.println("Im on home");
        }
    }
}
