package home.work.week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        // в nextInt - Int с заглавной чтобы разделять визуально названия
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a % 10 == b % 10 ){
            System.out.println("TRUE");
            // так как нет других условий, а TRUE соблюдаем (выводим корректно на экран, то указываем else, все результаты которые остались.
        }else{
            System.out.println("FALSE");
        }


    }
}
