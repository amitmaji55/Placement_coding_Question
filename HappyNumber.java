package com.company;

import java.util.Scanner;

public class HappyNumber {
    public static boolean IsHappy(int n)
    {
        int temp,sum=0,rem;
        temp = n;
       while(temp>9){
           while(temp>0)
           {
               rem = temp%10;
               sum = sum + (int) Math.pow(rem,2);
               temp =temp/10;
           }
           temp =sum;
           sum = 0;
       }
       if(temp==1)
           return true;
       else
           return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(IsHappy(n))
            System.out.println("happy number");
        else
            System.out.println("unhappy Number");
    }
}
