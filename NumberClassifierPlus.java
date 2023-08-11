package Chapter5_solve;

import java.util.Scanner;

public class NumberClassifierPlus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a floating-point number: ");


        double num = scanner.nextDouble();


        scanner.close();


        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }

        double absValue = Math.abs(num);
        if (absValue < 1) {
            System.out.println(", small");
        } else if (absValue > 1000000) {
            System.out.println(", large");
        } else {
            System.out.println();
        }
    }
    
}
