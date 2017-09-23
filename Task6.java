package home.work.week2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a + b >= 11 && a + b <= 19){
            System.out.println(a + b);
        }
    }
}
