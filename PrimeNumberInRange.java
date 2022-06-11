package com.company;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static boolean ISPrime(int n)
    {
        int i;
        for (i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the 1st range = ");
        int m = sc.nextInt();
        System.out.println("Enter the 2nd range = ");
        int p = sc.nextInt();
        for (n =m;n<=p;n++)
        {
            if(ISPrime(n))
                System.out.println(n);
        }
    }
}
