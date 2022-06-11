package com.company;

import java.util.Scanner;

public class Calculater {
    static int digitcount(int n )
    {
        int c = 0;
        while(n!=0)
        {
            n = n/10;
            c++;
        }
        return c;
    }
    static int power(int n)
    {
        int rem,sum=0,count,p;
        count = digitcount(n);
        while(n!=0)
        {
            rem = n%10;
            p = (int) Math.pow(rem,count);
            sum = sum+p;
            n = n/10;
            count--;
        }
        return  sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int s = power(n);
        if(s==n)
        {
            System.out.println("Disarium");
        }
        else
        {
            System.out.println("Not a disarium number ");
        }
    }
}
