package home.work.week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // пишем условие, если значение делится без остатка на 7, то выводим его не екран умноженным на 2
        if(a % 7  == 0){
            System.out.println(a*2);

        }

    }
}
