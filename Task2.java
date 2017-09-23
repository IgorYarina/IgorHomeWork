package home.work.week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.print("MAX ");
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else if(c > b && c > a){
            System.out.println(c);
        }
        System.out.print("MIN ");
        if(a < b && a< c){
            System.out.println(a);
        }else if(b < a && b < c){
            System.out.println(b);
        }else if(c < b && c < a){
            System.out.println(c);
        }


    }
}
