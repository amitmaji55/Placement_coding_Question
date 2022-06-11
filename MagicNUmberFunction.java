package com.company;

import java.util.Scanner;

public class MagicNUmberFunction {
    public static boolean checker(int n)
    {
        int sum=0;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum=sum+(n%10);
            n=n/10;
        }
        if(sum==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(checker(n))
            System.out.println("Magic Number");
        else
            System.out.println("Not a magic number ");
    }
}
