package home.work.week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        //scan.nextInt - можно оставить в таком виде, так как Double больше (но не наоборот).
        double a = scan.nextInt();
        double b = scan.nextInt();
        if(a % b == 0) {
            // для того чтобы вывести текст и резкльтат в одной строке используем +
            System.out.println("TRUE " + a / b);
        }else if(b % a == 0){
            System.out.println("TRUE " + b / a);

        }else{
            System.out.println("FALSE " + a / b);
        }
    }
}
