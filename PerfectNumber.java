package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect (int n)
    {
        if(n==1)
            return false;
        int sum =0;
        for (int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =sc.nextInt();
        if(isPerfect(n))
            System.out.println("Perfect");
        else
            System.out.println("Not");
    }
}
