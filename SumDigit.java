package com.company;

import java.util.Scanner;

public class SumDigit {
    public static int getdigitsum(int n ) {
        int sum = 0;
        if (n < 0)
            return -1;
        else {
            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            if (sum <= 9)
                return sum;
            else
                return getdigitsum(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = getdigitsum(n);
        System.out.println(res);
    }
}
