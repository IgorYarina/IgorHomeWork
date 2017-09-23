package home.work.week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b){
            System.out.println(a - b);
            // применили только else так как есть только 2 условия
        }else {
            System.out.println(a+b);
        }
    }

}

