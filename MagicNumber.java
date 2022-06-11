package com.company;
import java.util.Scanner;

public class MagicNumber
{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n = in.nextInt();
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                n =n/ 10;
                sum = sum+d;
            }
            n = sum;
        }
        if (n == 1)
            System.out.println(n + " is Magic Number");
        else
            System.out.println(n + " is not Magic Number");

    }
}
