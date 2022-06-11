package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean IsArmstrong(int n)
    {
        int temp,count=0,rem,sum=0;
        temp =n;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0)
        {
            rem=temp%10;
            sum = sum+(int) Math.pow(rem,count);
            temp=temp/10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (IsArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
