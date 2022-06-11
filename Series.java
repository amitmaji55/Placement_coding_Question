package com.company;

import java.util.Scanner;

public class Series {
    static int calfactorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * x;
        }
        return fact;
    }

    static int power(int x, int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * x;
        }
        return p;
    }

    static double sumcal(int x, int n) {
        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            double p = power(x, i);
            int f = calfactorial(x);
            sum = sum + (p / f);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        double ans = sumcal(x,n);
        System.out.println(" "+ans);
    }
}