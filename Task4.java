package home.work.week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter number with ,");
        Scanner scan = new Scanner (System.in);
        Double a = scan.nextDouble();
        if(a >=0 && a<=1){
            // если условие выполнили то выводим да
            System.out.println("YES");
        }
    }
}
